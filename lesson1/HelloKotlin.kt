import lesson1.Person

fun main() {
    val a: String = "Kotlin"
    println(a)

    println(hello("Artur"))
    println(hello("Bil"))
    sum(1, 2)


    println(Person().name)

    val b: MutableList<String> = mutableListOf("Java", "Kotlin")
    b.add("GO")

    var c = listOf("Java", "Kotlin")

    var d = 10

    var e = if (d > 5) {
        d
    } else {
        0
    }
    println(e)

    // аналог switch
    var color = when (d) {
        10 -> "green"
        5 -> "red"
        0 -> "orange"
        else -> {
            "NON"
        }
    }

    println(color)


    // аналог switch, в виде функции
    fun color(d: Int) = when (d) {
        10, 9, 8 -> "green"
        5, 4 -> "red"
        0 -> "orange"
        else -> {
            0
        }
    }

    println(color(5))

    // var arrayList = listOf(1, 2, 3, 4, 5)

    for (i in listOf(1, 2, 3, 4, 5)) {
        print(i)
        print(" ")
    }
    println()

    for (i in "abc") {
        println(i)
    }
    println()

    for (i in 1..10 step 3) {
        println(i)
    }
    println()

    for (i in 10 downTo 1 step 3) {
        println(i)
    }
    println()

    // не включая последнее число - 5
    for (i in 1 until 5) {
        println(i)
    }
    println()

}

fun hello(name: String): String {
    return "Hello $name"
}

fun sum(a: Int, b: Int) {
    println("Sum = ${a + b}")
}