fun main() {
    val n = readLine()!!.toInt()
    val target = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    for (i in target.indices) {
        val key = target[i]
        var j = i - 1
        while (j >= 0 && target[j] > key) {
            target[j + 1] = target[j]
            j--
        }
        target[j + 1] = key
        println(target.joinToString(" "))
    }
}

