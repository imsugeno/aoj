import kotlin.random.Random

fun main() {
    /*
    -- practice 1 --
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
    */

    /*
    -- practice 2 --
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    */

    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}

// data class Employee(val name: String, var salary: Int)


class Contact(val id: Int, var email: String) {
    val category: String = ""
}

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

data class Name(val first: String, val last: String)

data class Address(val street: String, val city: City)

data class City(val city: String, val country: String)

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names: List<String> = listOf("takeshi", "tamotsu", "ryosuke")
    fun generateEmployee(): Employee {
        return Employee(
            names.random(),
            Random.nextInt(minSalary, maxSalary)
        )
    }
}
