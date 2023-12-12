package lesson1.tasks

/**
 * Вам необходимо вывести в консоль слово Work work на каждой новой строке,
 * и на следующей единой строке индексы и рабочие дни :
 *
 * Sample Input:
 *
 * "Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat"
 *
 * Sample Output:
 *
 * Work work
 * 1: Mon
 * Work work
 * 2: Tues
 * Work work
 * 3: Wed
 * Work work
 * 4: Thur
 * Work work
 * 5: Fri
 */

fun main(args: Array<String>) {

    var map = mapOf(7 to "Sun", 1 to "Mon", 2 to "Tues", 3 to "Wed", 4 to "Thur", 5 to "Fri", 6 to "Sat")

    for (i in map) {
        if (i.key != 6 && i.key != 7) {
            println("Work work")
            println("${i.key}: ${i.value}")
        }
    }
}