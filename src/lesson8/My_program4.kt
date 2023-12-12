package lesson8

// расчет суммы налога

fun main() {
    val sum_user: String? = readLine()

    if (sum_user == null) return

    val sum: Int = sum_user.toInt()
    val tax: Double = calcTax(sum)

    println("For ${sum} tax is ${tax}")
}

fun calcTax(sum: Int): Double {
    val tax_ratio = 0.13
    return tax_ratio * sum.toDouble()
}


