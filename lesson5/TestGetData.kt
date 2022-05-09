package lesson5

class TestGetData {

}

fun main() {
    println("Введите данные:")
    var a = readLine()!!.toInt()
//    var a = readLine()?.toInt()

    var b: Int = 5

    b += a

//    if (a != null) {
//        b += a
//    }

    println("Вы ввели: $a")
    println("Переменная b = $b")
}

