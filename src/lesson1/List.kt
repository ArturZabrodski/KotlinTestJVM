package lesson1

fun main() {

    // List-ом является неизменяемый список элементов, который хранит в себе
    // элементы в том порядке, в котором они были добавлены в него:

    val list = listOf(1, 3, 9)

    var students1: List<String>

    students1 = listOf("Beibut", "Azat", "Sultan")

    // Изменяемый список создается через метод mutableListOf():

    val students2 = mutableListOf("Beibut", "Azat", "Sultan")

    students2.add("Dias")

    // Доступ к отдельному элементу списка, 2 способа

    println(students1[2])

    println(students1.get(2))

    // размер списка
    println(students1.size)
}