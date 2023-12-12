package lesson1.tasks

/**
 * Число x является простым, если оно больше 1 и при этом делится без остатка только на 1 и на x
 *
 * Задача
 * Необходимо просуммировать все простые числа до введенного включительно
 *
 * Sample Input:
 * 2
 * Sample Output:
 * 2
 */

val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    val n = scan.nextInt()

    var result = 0

    if (n >= 2) {
        for (i in 2..n) {
            if (isPrime(i)) {
                result += i
            }
        }
    }

    println(result)
}

fun isPrime(n: Int): Boolean {
    var count = 0
    // является ли число n простым
    for (i in 1..n) {
        if (n % i == 0)
            count++
    }

    if (count == 2)
        return true
    else
        return false
}