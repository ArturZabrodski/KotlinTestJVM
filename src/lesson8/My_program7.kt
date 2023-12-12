package lesson8

/**
 * Жители системы Жука имеют достаточно высокую даже по галактическим меркам продолжительность жизни.
 * Поэтому пришельцы были крайне удивлены тем, что 1) земляне зачем-то измеряют отрезки времени 2)
 * как они их именуют. Это очень сильно осложняет культурный обмен. При попытках земного исследователя
 * соотнести факты рассказанные пришельцем, последний непонимающе моргает всеми пятью глазами и устало
 * берется за голову передней лапкой. Поэтому, земляне придумали упрощенную систему летоисчисления
 * специально для гостей с далеких звезд.

Реализуйте функцию getYearEra, которая для введенного в качестве аргумента функции года возвращает один из возможных вариантов его положения относительно даты начала Unix-эры (1970 год) в виде строки:

before
equals
after (XX century)
after (XXI century)
distant future
Например:

2712  -> "distant future"
1971  -> "after (XX century)"
 */

fun main() {
    println(getYearEra(1970))
    println(getYearEra(2000))
    println(getYearEra(2001))
    println(getYearEra(2100))
}

fun getYearEra(year: Int): String {
    var result =
            if (year > 2000 && year <= 2100) "after (XXI century)"
            else if (year > 2100) "distant future"
            else if (year > 1970 && year <= 2000) "after (XX century)"
            else if (year == 1970) "equals"
            else "before"

    return result
}