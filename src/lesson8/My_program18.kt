package lesson8

import java.util.*

/**
 * Земные бухгалтеры одержали первую значительную победу над инопланетным разумом
 * и уговорили пришельцев изменить принцип формирования зарплатных ведомостей.
 * Отныне ведомость представляет из себя мешанину из чисел и значений null (наиболее
 * точный перевод с языка пришельцев - тяжелый вздох и обреченное согласие с младшей
 * формой жизни после часа препирательств). Количество значений null отображает
 * удовлетворенность работой землянина - чем меньше, тем лучше.

Создайте функцию calcNullValues(input: Array<Int?>):Array<Int> ,
возвращающую массив, первым элементом которого является количество
null-значений в массиве input, а вторым - сумма всех не-null значений.

Из консоли/В консоль ничего читать/писать не нужно!
 */

fun main() {
    var array: Array<Int?> = arrayOf(82, null, 7, null, null)

    println(calcNullValues(array).contentToString())

}

fun calcNullValues(input: Array<Int?>): Array<Int> {
    var newArray: Array<Int> = arrayOf(0, 0)

    for (i in input) {
        if (i == null)
            newArray[0]++
        else
            newArray[1] += i
    }

    return newArray
}