fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress!")
    return "Notification sent!"
}

fun getNextAddress(): String {
    return "sebastian@jetbrains.com"
}

class Client() {
    var token: String? = null
    fun connect() = println("connected!")
    fun authenticate() = println("authenticated!")
    fun getData(): String = "Mock data"
}

// val client = Client().apply {
//     token = "asdf"
//     connect()
//     authenticate()
// }

val client: Client = Client().apply {
    token = "asdf"
}

fun main() {
    // val address: String? = getNextAddress()
    // val confirm = address?.let {
    //     sendNotification(it)
    // }
    val result: String = client.run {
        connect()
        authenticate()
        getData()
    }

    println(result)

    // client.getData()
}