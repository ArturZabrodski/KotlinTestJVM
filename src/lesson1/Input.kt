package lesson1

val scan = java.util.Scanner(System.`in`)

fun main(args: Array<String>) {
    val str1 = scan.nextLine()
    println(str1)  // выводит строку

    val str2 = scan.next()
    println(str2)  // выводит текст до первого пробела

    var number = scan.nextInt()
    println(number * 10)  // выводит число

    val str3 = readLine()!!.toString()
    println(str3)  // выводит строку

    val str4 = readln().toInt()
    println(str4)  // выводит число
}