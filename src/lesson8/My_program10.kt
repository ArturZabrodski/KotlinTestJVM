package lesson8

/**
 * Работники-земляне также были неприятно удивлены тем фактом, что им приходится сортировать
 * корреспонденцию пришельцев на их родном языке. Не спас ситуацию и тот факт, что гости со
 * звезд милостиво согласились предоставить копии документов в английской транслитерации.
 * Единственно, что стало понятно - чем больше употребляется слово BUG в документе, тем он важнее.

Реализуйте функцию calculateBugMentions, которая находит количество употреблений слова BUG в списке.

Из консоли/в консоль ничего читать/писать не нужно!

Sample Input:
KLPQYM BUG KHQR KLPQYM JVOJTD JVOJTD BUG BUG KHQR BUG KLPQYM JVOJTD KLPQYM JVOJTD QLSPA
KHQR JVOJTD KLPQYM JVOJTD KLPQYM KLPQYM JVOJTD JVOJTD BUG KLPQYM KHQR JVOJTD KHQR KLPQYM
KLPQYM JVOJTD KLPQYM BUG BUG BUG

Sample Output:
8
 */


// не работает, надо разделить слова
fun main() {
    val list: List<String> = listOf("KLPQYM BUG KHQR KLPQYM JVOJTD JVOJTD BUG BUG KHQR BUG KLPQYM JVOJTD KLPQYM JVOJTD QLSPA\n" +
            "KHQR JVOJTD KLPQYM JVOJTD KLPQYM KLPQYM JVOJTD JVOJTD BUG KLPQYM KHQR JVOJTD KHQR KLPQYM\n" +
            "KLPQYM JVOJTD KLPQYM BUG BUG BUG")

    println(calculateBugMentions(list))
}

fun calculateBugMentions(input: List<String>): Int {
    var result: Int = 0

    //каждый элемент это String переменная
    for (i in input) {
        if (i == "BUG") {
            result++
        }
    }

    return result
}
