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

data class ProductInfo(val priceInDollars: Double?)

class Product {
    fun getProductInfo(): ProductInfo  {
        return ProductInfo(100.0)
    }
}

// Rewrite this function
fun Product.getPriceInEuros() = getProductInfo()?.priceInDollars?.let { convertToEuros(it) }

fun convertToEuros(dollars: Double): Double {
    return dollars * 0.85
}

data class User(val id: Int, var email: String)

fun updateEmail(user: User, newEmail: String): User = user.apply { 
    email = newEmail
 }.also { 
    println("Updating email for user with ID: ${it.id}")
}

fun main() {
    // val address: String? = getNextAddress()
    // val confirm = address?.let {
    //     sendNotification(it)
    // }
    // val result: String = client.run {
    //     connect()
    //     authenticate()
    //     getData()
    // }

    // println(result)

    // val meadals: List<String> = listOf("Gold", "Silver", "Bronze")
    // val reversedLongUppercaseMedals: List<String> = 
    //     meadals
    //         .map { it.uppercase() }
    //         .also { println(it) }
    //         .filter { it.length > 4 }
    //         .also { println(it) }
    //         .reversed()
    //     println(reversedLongUppercaseMedals)

    /*
    practice 1
    val product = Product()
    val priceInEuros = product.getPriceInEuros()

    if (priceInEuros != null) {
        println("Price in Euros: €$priceInEuros")
        // Price in Euros: €85.0
    } else {
        println("Price information is not available.")
    }
    */

    // practice 2
    val user = User(1, "old_email@example.com")
    val updatedUser = updateEmail(user, "new_email@example.com")
    // Updating email for user with ID: 1

    println("Updated User: $updatedUser")
    // Updated User: User(id=1, email=new_email@example.com)
}

