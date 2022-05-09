package lesson3

class Human() {
    var name: String = "Bill"
    var age: Int = 10
    var country: String? = null

//    constructor() {
//    }

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, country: String) : this() {
        this.name = name
        this.age = age
        this.country = country
    }

    fun printInfo() {
        println("My name is $name. I'm $age years. I'm from $country.")
    }
}

fun main() {
    var humanBill = Human()
    var humanBob = Human("Bob", 20, "USA")
    var humanJohn = Human("John", 25, "Canada")

    humanBill.printInfo()
    humanBob.printInfo()
    humanJohn.printInfo()

}