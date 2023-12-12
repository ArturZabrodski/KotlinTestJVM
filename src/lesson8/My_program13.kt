package lesson8

/**
Расширьте код ПО сахарного хранилища классом для представления невоеннообязанных
(гражданских) пришельцев.

Создайте класс-наследник BugCivilian, используя класс Bug в качестве базового.

Переопределите работу метода getSugarLimit таким образом, чтобы он возвращал в
два раза меньший результат (подсказка - дробную часть можно отбросить).
 */

open class Bug(val rank: Int, val name: String) {
    open fun getSugarLimit(): Int {
        return rank
    }

    fun getId(): String {
        return "${rank}.${name}"
    }
}

class BugCivilian(rank: Int, name: String) : Bug(rank, name) {
    override fun getSugarLimit(): Int {
        return super.getSugarLimit() / 2
    }
}