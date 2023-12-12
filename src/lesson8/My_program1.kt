package lesson8

/**
 * input
 * output
 */

fun main() {
    var s: String = "5"
    var sum: Int

    val a = readLine()!!.toInt()

    sum = a + s.toInt()

    println("sum = ${sum}")  // sum = 12
    println("sum = $sum")  // sum = 12
}