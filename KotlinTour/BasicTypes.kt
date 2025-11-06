fun main() {
    InitError()
}

fun Calc() {
    var customers = 10
    customers = 8
    customers = customers + 3
    println("8+3=${customers}")
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3
    
    println(customers)
}

fun NoInit() {
    val d: Int
    d = 3

    val e: String = "hello"
    println(d)
    println(e)
}

fun InitError() {
    val d: Int
    // println(d)
}