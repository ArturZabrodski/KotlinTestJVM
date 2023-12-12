package lesson7

fun main() {
    var user1 = User("Mark", 20)
    var user2 = User("Katy", 25)

    println(user1)
    println(user2)

    if (user1 == user2) {
        println("Equals")
    } else {
        println("Not Equals")
    }

    if (user1.equals(user2)) {
        println("Equals")
    } else {
        println("Not Equals")
    }

    var user3 = user1.copy(name = "Lessia")
    println(user3)
}

// показывает equals только через data class

// в обычном классе var можно не указывать, но equals не работает
// class User(name: String, age: Int)

// Any - неопределенный тип
//data class User(var name: Any, var age: Any) {

data class User(var name: String, var age: Int) {
//    override fun toString(): String {
//        return "User(name: $name, age: $age)"
//    }
}