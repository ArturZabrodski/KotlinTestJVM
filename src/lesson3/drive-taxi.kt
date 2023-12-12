package lesson3

class Taxi {
    private var x: Int = 0
    private var y: Int = 0

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun moveRight() {
        x++
    }

    fun moveLeft() {
        x--
    }

    fun moveUp() {
        y++
    }

    fun moveDown() {
        y--
    }

    fun getX(): Int {
        return this.x
    }

    fun getY(): Int {
        return this.y
    }
}

fun driveTaxi(taxi: Taxi, toX: Int, toY: Int) {
    taxi.moveLeft()
    taxi.moveDown()
    taxi.moveDown()
    taxi.moveDown()
    taxi.moveDown()
}

fun main() {
    var taxi = Taxi(2, 5)
    driveTaxi(taxi, 1, 1)
    println(taxi.getX())
    println(taxi.getY())
}

