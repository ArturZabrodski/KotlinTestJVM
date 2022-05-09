import lesson2.printTest
import lesson3.printTest as pT

fun main() {
    val str1: String? = "Hello"
    // val str1: String? = null

    // проверка на null
    val a: Int = str1?.length ?: 0;
    println(a)

    // не сработает из за знака вопроса
    // print(s.length)

    // знаки восклицания позволяют игнорировать ?
    // Но если null, то будет exception
    println(str1!!.length)


    val str2: String? = null

    // проверка на null, и выведет null
    println(str2?.length)


    // не пустая строка
    val str3: String? = ""

    println(str3?.length)

    printTest()
    pT()
}

