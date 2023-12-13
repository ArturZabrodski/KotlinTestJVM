package lesson4

class Car(var name: String) {

    fun drive() {
        println("$name is driving...")
    }

    fun stop() {
        println("$name is stopping...")
    }
}


fun main() {
    val car = Car("Toyota")

    println("car = ${car.name}") // if the name is private, there will be a compilation error
    car.drive()
    car.stop()
}