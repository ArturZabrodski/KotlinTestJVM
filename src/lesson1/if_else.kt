package lesson1

fun main() {

    val a = readln().toInt()

// Оператор if-else может быть использован в виде выражения при объявлении переменной
    val b = if (a == 5) 1 else 0

    println(b)

// Записью x..y можно объявить диапазон чисел от x до y.
// Если проще - список чисел от x до y, включая границы.
// Оператор in (диапазон) с операндом a имеет значение true,
// если число a находится в заданном диапазоне и false, если не находится.
    println(a in 1..10)


// Эта программа считывает число и проверяет, является ли оно двузначным.
    println(a in 10..99)

// проверяет ненахождение числа в диапазоне, вернет true вне диапазона
    println(a !in 10..14)
}