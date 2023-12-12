package lesson1

fun main() {

    // В коллекции с интерфейсом Set дубликаты элементов не допускаются,
    // все элементы должны быть уникальными.

    val numbers = setOf(1, 3, 9)
    val students = setOf("Beibut", "Azat", "Sultan")

    // Мы не можем обратиться к нужному элементу по индексу через квадратные скобки,
    // как у List. Но мы можем использовать elementAt()

    println(students.elementAt(2))

    // Функция sortedSetOf() создаёт изменяемую Java-коллекцию TreeSet с сортированными значениями.

    val sortedSet  = sortedSetOf(2, 4, 3, 5, 1)
    sortedSet.add(6) // добавляем 6
    sortedSet.remove(1) // удаляем 1
    println(sortedSet) // [2, 3, 4, 5, 6]

    // Функция linkedSetOf() создаёт изменяемую Java-коллекцию LinkedHashSet
    // в том порядке, в котором были занесены данные.

    val linkedHashSet = linkedSetOf(5, 1, 2, 3, 9, 4)
    linkedHashSet.add(44)
    linkedHashSet.remove(2)
    println(linkedHashSet) // [5, 1, 3, 9, 4, 44]

    // Изменяемое множество MutableSet.
    // Функция add() проверяет, встречается ли переданный объект в MutableSet.
    // Если дубликат будет найден, возвращается false. Но если значение не является
    // дубликатом, оно добавляется в MutableSet (с увеличением размера на 1),
    // а функция возвращает true — признак успешного выполнения операции.

    val mutableSet: MutableSet<Int> = mutableSetOf(3, 27, 66, 12, 10)
    mutableSet.add(8)
    mutableSet.add(27) // не добавится
    mutableSet.remove(3)
    println(mutableSet) // [27, 66, 12, 10, 8]
}