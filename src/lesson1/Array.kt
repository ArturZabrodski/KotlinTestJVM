package lesson1

fun main() {
    val words: Array<String> = arrayOf("a", "b", "c", "d", "e")

    for (word in words) {
        print(word + " ")
    }     // a b c d e

    println()

    for (word in words) {
        print(word)
        if (word != words[words.size - 1]) {
            print(", ")     // a, b, c, d, e
        }
    }

    println()

    println(words.joinToString()) // a, b, c, d, e

    println()

    // Существует также синонимы метода, когда уже в имени содержится подсказка:
    // intArrayOf(), charArrayOf(), booleanArrayOf(),
    // longArrayOf(), shortArrayOf(),
    // byteArrayOf(), arrayOfNulls()

    val n = words[1]  // получаем второй элемент b

    words[2] = "f"      // переустанавливаем третий элемент

    println("words[2] = ${words[2]}") // words[2] = f


    var arr: DoubleArray = DoubleArray(5)
    println(arr.joinToString())
}