package lesson8

/**
 * Class, constructor, наследование, переопределение методов
 *
 * добавляем слово open к классу, методу, которые переопределяем
 * также через запятую можно указать интерфейс от которого наследуемся
 */

// в одной строке объеявление переменных, инициализация и первичный конструктор
open class Rectangle(var h: Int, var w: Int) {
//    var h: Int
//    var w: Int
//        get() = field
//        set(value) {
//            field = value
//        }

//    init {
//        this.h = h
//        this.w = w
//    }

    constructor(x1: Int, y1: Int, x2: Int, y2: Int) : this(y2 - y1, x2 - x1) {
    }

    public open fun pq(): Int {
        return h * w
    }
}

class magicRect(h: Int, w: Int) : Rectangle(h, w) {
    override fun pq() = 42 * super.pq()
}