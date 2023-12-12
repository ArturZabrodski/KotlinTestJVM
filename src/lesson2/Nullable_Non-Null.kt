import lesson2.printTest
import lesson3.printTest as pT

fun main() {
    // в данном случае знак ? необязателен
    val str1: String? = "Hello"

    // проверка на null
    val a: Int = str1?.length ?: 0;
    println(a)  // 5

    // не сработает из за знака ? в объявлении переменной
//  println(str1.length)

    // знаки !! позволяют игнорировать ?
    // Но если null, то будет exception
    println(str1!!.length)  // 5


    // ставим знак ?, предполагая, что переменная не равна null
    val str2: String? = null

    // проверка на null, и выведет null
    println(str2?.length)   // null

    // Оператор not-null (!!) преобразует любое значение в non-null тип и выдает исключение,
    // если значение равно null

//  println(str2!!.length)  // exception

    val str3: String? = ""  // не пустая строка

    println(str3?.length)   // 0


    printTest()  // вызов метода printTest() из каталога lesson2
    pT()         // вызов метода printTest() из каталога lesson3
}

