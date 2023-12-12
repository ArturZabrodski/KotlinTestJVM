import lesson1.Person

fun main() {
    val a: String = "Kotlin"
    println(a)

    println(hello("Artur")) // Hello Artur
    println(hello("Bil"))   // Hello Bil
    sum(1, 2) // Sum = 3


    println(Person().name) // вызов метода getName // bob


    val b: MutableList<String> = mutableListOf("Java", "Kotlin")
    b.add("GO")

    var c = listOf("Java", "Kotlin")


    var d = 10

    var e = if (d > 5) {
        d
    } else {
        0
    }

    println(e)  // 10


    // аналог switch
    var color = when (d) {
        10 -> "green"
        5 -> "red"
        0 -> "orange"
        else -> {
            "NON"
        }
    }

    println(color)  // green


    // аналог switch, в виде функции
    fun color(d: Int) = when (d) {
        10, 9, 8 -> "green"
        5, 4 -> "red"
        0 -> "orange"
        else -> {
            0
        }
    }

    println(color(5))  // red
}

fun hello(name: String): String {
    return "Hello $name"
}

fun sum(a: Int, b: Int) {
    println("Sum = ${a + b}")
}