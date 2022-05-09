package lesson3

// getter и setter методы класса

class Student {
    var name: String? = null

    //        get() {
//            return if (field == null) {
//                ""
//            } else {
//                field
//            }
//        }
//        set(value) {
//            field = value
//        }
    var age: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else {
                field = 0
            }
        }

//    fun printName() {
//        println("My name is $name")
//    }
}

