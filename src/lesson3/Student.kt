package lesson3

// getter и setter методы класса

class Student {
    var name: String? = null
        get() {
            return if (field == null) {  // field - ключевое слово, обращение к name в данном случае
                ""
            } else {
                field
            }
        }
        set(value) {  // value - это вводимое значение
            field = value
        }

    var age: Int = 0
        set(value) {   // value - это вводимое значение
            if (value > 0) {
                field = value   // field - ключевое слово, обращение к age в данном случае
            } else {
                field = 0
            }
        }

//    fun printName() {
//        println("My name is $name. I'm $age years")
//    }
}


fun main() {
    var student = Student()

    println(student.name)
    println(student.age)
    student.printName()

    println()

    student.name = "Artur"
    student.age = 33
    println(student.name)
    println(student.age)
    student.printName()
}

// Extension function
fun Student.printName() = println("My name is $name. I'm $age years")
