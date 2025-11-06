fun main() {
    ListFuns()
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