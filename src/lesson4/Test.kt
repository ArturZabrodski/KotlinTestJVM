package lesson4

import java.io.File
import java.io.FileInputStream

// Обработка исключений (@Throws try{..} catch{...})

class Test {
//    val a: Int = try {
//        readLine()!!.toInt()
//    } catch (e: Exception) {
////        throw e
//        0
//    }

    @Throws(Exception::class)
    fun myMethod(a: Int, b: Int): Int {
        if (b == 0) {
            throw ArithmeticException("Some exception")
        }
        return a / b
    }
}

fun main() {
//    print(Test().myMethod(1,0))  // ArithmeticException

    print(Test().myMethod(3,1))

//    var f: FileInputStream = FileInputStream(File("./xvxcvx"))  // FileNotFoundException
}