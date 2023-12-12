package lesson1

fun main() {

    // Неизменяемый Map создаётся через mapOf():
    // ключ-значение
    val map = mapOf(123 to "number1", 345 to "number2", 678 to "number3")

    println(map) // {123=number1, 345=number2, 678=number3}

    // В примере ключи были числами, а значения строками.
    // Можно сделать наоборот, ключи будут строками, а значения числами.

    val map2 = mapOf("Two" to 2, "Three" to 3, "Four" to 4)

    println(map2) // {Two=2, Three=3, Four=4}

    // Проверить существование ключа или значения можно через containsKey() и containsValue().

    println(map2.containsKey("One")) // false
    println(map2.containsValue(2))   // true

    // Получить значение у заданного ключа можно через get() или getValue().
    // Если указать несуществующий ключ, то get() вернёт null, а getValue()
    // выбросит исключение NoSuchElementException.

    val map3 = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)

    println(map3.getValue("One"))
    println(map3["Two"])


    // mutableMapOf() - изменяемый Map.
    // Так как мы имеем дело с изменяемым Map, то у него есть дополнительные возможности.
    // Например, мы можем добавить новую запись через put().

    val map4 = mutableMapOf("Zero" to 0, "One" to 1, "Two" to 2)
    map4.put("Three", 3) // добавляем новую запись
    map4.remove("Zero")   // удаляем запись
    println(map4)  // {One=1, Two=2, Three=3}
    map4.clear() // очищаем все записи, но объект остается
    println(map4)  // {}
}