package lesson3

fun main() {
    var student = Student()

    println(student.name)
    println(student.age)

    student.printName()

    student.name = "Artur"
    student.age = 32
    println(student.name)
    println(student.age)

    student.printName()
}

// Extension function
fun Student.printName() = println ("My name is $name")