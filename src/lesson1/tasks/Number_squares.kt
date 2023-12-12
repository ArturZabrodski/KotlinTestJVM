package lesson1.tasks

/**
 * Необходимо вывести на экран (println) квадраты натуральных чисел,
 * которые предшествуют введенному числу (включительно). К примеру для 4 вывод будет:
 *
 * 1
 * 4
 * 9
 * 16
 */

fun main() {

    val value = readln().toInt()

    for (i in 1..value){
        println(i*i)
    }

}