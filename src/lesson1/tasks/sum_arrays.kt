package lesson1.tasks

/**
 * Необходимо просуммировать каждый элемент двух массивов. На вход дается:
 * Число - количество элементов в массивах
 * Массив 1
 * Массив 2
 * На выходе должно отображаться (println) сумма элементов массивов
 *
 * Sample Input:
 * 3
 * 1 3 5
 * 6 4 1
 * Sample Output:
 * 7
 * 7
 * 6
 */

fun main() {

    val n = scan.nextInt()

    var array1 = IntArray(n)
    var array2 = IntArray(n)



    for (i in 0..n - 1) {
        array1[i] = scan.nextInt()
    }

    println()

    for (i in 0..n - 1) {
        array2[i] = scan.nextInt()
    }

    for (i in 0..n - 1) {
        println(array1[i] + array2[i])
    }
}