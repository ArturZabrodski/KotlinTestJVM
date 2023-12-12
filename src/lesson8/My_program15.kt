package lesson8

/**
 * Простые работники посольства пришельцев столкнулись с новой проблемой -
 * принцип сортировки бумаг изменился! Для того чтобы понять, к кому из послов
 * относится сообщение, необходимо найти самое часто употребляемое слово. Оно и
 * будет именем ответственного лица.

Реализуйте функцию calculateWordStat, которая находит самое часто употребляемое слово в строке.

Sample Input 1:

PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM
Sample Output 1:

DTQEHGC
 */

fun main() {
    var str: String = "PDDPEM MXWHL XJID XJID XJID DTQEHGC DTQEHGC MXWHL XJID DTQEHGC DTQEHGC MXWHL PDDPEM QUCO DTQEHGC MXWHL DTQEHGC MXWHL PDDPEM XJID MXWHL DTQEHGC DTQEHGC XJID XJID XJID MXWHL MXWHL MXWHL MXWHL DTQEHGC PDDPEM DTQEHGC DTQEHGC PDDPEM"

    println(calculateWordStat(str))
}

fun calculateWordStat(input: String): String {
    val list = input.split(" ")
    var map = mutableMapOf<String, Int>()

    for (l in list) {
        map[l] = map.getOrDefault(l, 0) + 1
    }

    var m = 0
    var l: String = ""

    for (k in map) {
        if (k.value > m) {
            m = k.value
            l = k.key
        }
    }

    return (l)
}