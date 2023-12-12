package lesson2

/**
 * Функция может принимать переменное количество параметров одного типа.
 * Для определения таких параметров применяется ключевое слово vararg.
 * Например, нам необходимо передать в функцию несколько строк, но сколько
 * именно строк, мы точно не знаем. Их может быть пять, шесть, семь и т.д.:
 */


//Функция printStrings принимает неопределенное количество строк.
// В самой функции мы можем работать с массивом  и производить с ними некоторые действия.

fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}

fun sum(vararg numbers: Int){
    val result=numbers.sum()
    println("Сумма чисел равна $result")
}

fun main() {
    printStrings("Hello", "I", "am", "Android", "Developer")
    println("---------")

    sum(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("---------")

    // Оператор * (spread operator) позволяет передать параметру
    // в качестве значения элементы из массива
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    sum(*numbers)

}