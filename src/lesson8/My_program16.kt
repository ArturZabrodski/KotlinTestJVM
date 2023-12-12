package lesson8

import java.lang.NumberFormatException

/**
 * Exceptions
 * 1. Расчет суммы чисел введенных через запятую
 *
 * 2. Каждый банк в туманности Краба оборудован двумя тревожными кнопками.
 * Первая кнопка предназначена для котиков - в данной туманности они являются
 * опасными бандитами. Вторая кнопка - для собачек, поскольку некоторые жители
 * туманности могут не выдержать уровня их мимишности.
 *
Необходимо реализовать функцию checkClient(client : String), которая:
генерирует DogException в случае, если аргумент client содержит слово "dog"
генерирует CatException в случае, если аргумент client содержит слово "cat"
 */

fun main() {
    val str: String? = readLine()
    if (str == null) return

    val list_of_numbers = str.split(",")
    var sum: Int = 0

    for (number in list_of_numbers) {
        sum += try {
            number.toInt()
        } catch (e: NumberFormatException) {
            0
        }
    }

    println("Sum = ${sum}")

    //    checkClient("dog")
    checkClient("cat")
}

fun checkClient(client: String) {
    if (client == "dog") throw DogException()
    else if (client == "cat") throw CatException()
}

class DogException() : Exception()
class CatException() : Exception()