/**
 * Напишите программу, которая считывает трехзначное число и разворачивает его.
 */

val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {

    // 1 способ
    var value = scan.nextInt()

    println(value % 10 * 100 + value / 10 % 10 * 10 + value / 100)

    // 2 способ
    var a = scan.nextInt().toString()

    println("${a[2]}${a[1]}${a[0]}")

    // 3 способ
    println("${a.last()}${a[a.length / 2]}${a.first()}")

    // 4 способ
    println(a.reversed())


    var str: String = scan.nextLine()
    println(str.toUpperCase() + " " + str.toLowerCase())
}