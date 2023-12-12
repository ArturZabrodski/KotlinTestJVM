package lesson1.tasks

/**
 * Вам необходимо вывести в консоль буквы на каждой новой строке используя циклы:
 *
 * Sample Input:
 * a d
 *
 * Sample Output:
 * a
 * b
 * c
 * d
 */

fun main() {
    var str1 = readln()
    var str2 = readln()

    var a: Char = toChar(str1)
    var b: Char = toChar(str2)

//    var c = "f"
//    var d = c[0].toChar()
//    println(d) // f

    for (i in a..b) {
        println(i)
    }
}

fun toChar(str: String): Char {
    return str[0]
}

