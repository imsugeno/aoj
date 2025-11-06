fun main() {
    Practice3()
}

fun List() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("class of list: ${readOnlyShapes::class}")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println("class of mutablelist: ${shapes::class}")
    println(shapes)
}

fun ListFuns() {
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("The last item in the list is: ${readOnlyShapes.last()}")
    println("circle" in readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("pentagon")
    println(shapes)

    shapes.remove("pentagon")
    println(shapes)
}

fun Set() {
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

    println(readOnlyFruit)
    println("banana" in readOnlyFruit)

    fruit.add("dragonfruit")
    println(fruit)

    fruit.remove("dragonfruit")
    println(fruit)
}

fun Map() {
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    println("The value of pineapple juice is: ${readOnlyJuiceMenu["pineapple"]}")

    juiceMenu["coconut"] = 150
    println(juiceMenu)

    juiceMenu.remove("orange")
    println(juiceMenu)

    println("This map has ${readOnlyJuiceMenu.count()} key-value pairs")
    println(readOnlyJuiceMenu.containsKey("kiwi"))
    println(readOnlyJuiceMenu.keys)
    println(readOnlyJuiceMenu.values)
}

fun Practice1() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)

    println(greenNumbers.count() + redNumbers.count())
}

fun Practice2() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = SUPPORTED.contains(requested.uppercase())// Write your code here 
    println("Support for $requested: $isSupported")
}

fun Practice3() {
    val number2word:Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")// Write your code here
    val n:Int = 2
    println("$n is spelt as '${number2word[n]}'")
}