import kotlin.random.Random

fun main() {
    loopPractice1_2()
}

fun If() {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val a = 1
    val b = 2
    println(if (a > b) a else b)
}

fun When() {
    val obj = "Hello"

    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val trafficLightState = "Red"
    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)
}

fun practice1() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)

    val result: String
    if (firstResult == secondResult) {
        result = "You win :)"
    } else {
        result = "You lose :("
    }

    println("firstResult is ${firstResult}, secondResult is ${secondResult}, so result is ${result}")
}

fun practice2() {
    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}

fun loop() {
    for (number in 1..5) {
        print(number)
    }

    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake")
    }
}

fun loop2() {
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}

fun loopPractice1_1() {
    var pizzaSlices = 0
    // Start refactoring here
    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun loopPractice1_2() {
    var pizzaSlices = 0
    // Start refactoring here
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    } while (pizzaSlices < 7)
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

