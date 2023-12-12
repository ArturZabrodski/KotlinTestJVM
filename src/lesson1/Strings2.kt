package lesson1

/**
 * Напишите программу, которая считывает строку s
 * и заменяет символ с индексом 1 на букву
 * F, а предпоследний символ - на букву L.
 * Гарантируется, что строка состоит минимум из четырёх символов.
 */

fun main() {

    var s = scan.nextLine()

    s = s.substring(0, 1) + 'F' + s.substring(2, s.length - 2) + 'L' + s.substring(s.length - 1)

    println(s)
}

