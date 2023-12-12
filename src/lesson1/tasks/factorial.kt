package lesson1.tasks

/**
 * Напишем программу, вычисляющую факториал заданного целого числа.
 *
 * Факториал числа n — это произведение целых чисел от 1 до n включительно.
 * Предположим, что факториал 0 равен 1.
 * Факториал 1 также равен 1.
 */
fun main() {
    var value = readln().toInt()

    println(factorial(value))
}

fun factorial(n: Int): Int {
    var result = 1

    if (n == 0 || n == 1)
        return result

    for (i in 1..n) {
        result *= i
    }

    return result
}