package lesson6

class Obj {
    val a = 10
}

fun main() {
    var ob = object {
        var x1 = 10
        var x2 = 20
        var str = "Hello"
        fun sum(): Int {
            return x1 + x2
        }
    }

    println("sum = ${ob.sum()}")
    println("x1 = ${ob.x1}")
}

