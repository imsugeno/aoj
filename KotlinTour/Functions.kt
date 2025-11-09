import kotlin.math.PI

fun main() {
    // println(intervalInSeconds(1, 20, 15))
    // println(intervalInSeconds(minutes = 1, seconds = 25))
    // printurl()
    repeatN(5) {
        println("Hello")
    }
}

fun circleArea(radius: Int):Double = radius * radius * PI

fun intervalInSeconds(
        hours: Int = 0,
        minutes: Int = 0,
        seconds: Int = 0
): Int {
        return ((hours * 60) + minutes) * 60 + seconds
}

fun printUrl() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map(({action: String -> "${prefix}/${id}/${action}"}))
    println(urls)
}

fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}