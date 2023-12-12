package lesson1

fun main() {

    // var arrayList = listOf(1, 2, 3, 4, 5)

    for (i in listOf(1, 2, 3, 4, 5)) {
        print(i)
        print(" ")
    }
    // 1 2 3 4 5
    println("---------")

    for (i in "abc") {
        println(i)
    }
    // a
    // b
    // c
    println("---------")

    for (i in 1..10 step 3) {
        println(i)
    }
    // 1
    // 4
    // 7
    // 10
    println("---------")

    for (i in 10 downTo 1 step 3) {
        println(i)
    }
    // 10
    // 7
    // 4
    // 1
    println("---------")

    // не включая последнее число - 5
    for (i in 1 until 5) {
        println(i)
    }
    // 1
    // 2
    // 3
    // 4
    println("---------")

    // forEach Пройтись по всем элементам коллекции.

    val allStudents = listOf("Beibut","Azat","Dias","Nurbek","Dauren")
    allStudents.forEach{
        println(it)
    }

    println("---------")

    // forEachIndexed Пройтись по всем элементам коллекции c доступом к индексу.

    allStudents.forEachIndexed{ index, item ->
        println("$index : $item")
    }

    println("---------")

    // repeat() Встроенная функция для повторения команд заданное число раз.

    repeat(5){
        println("I am Android Developer!")
    }

    println("---------")

    // Ключевое слово continue позволяет продолжить перебор прервав
    // его на текущем шаге. Число 6 при этом не выводится:

    for (i in 1..10) {
        if (i == 6) {
            continue
        }
        println(i)
    }

    println("---------")

    // Можно прервать цикл через break. Когда число станет равным 6, цикл прекратится:

    var i = 1
    do {
        println(i)
        if (i == 6)
            break
        i++
    } while (i < 10)
}