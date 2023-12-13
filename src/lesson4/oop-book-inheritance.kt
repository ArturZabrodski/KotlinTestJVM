package lesson4

open class Book(val pages: Int, val author: String, var cost: Float = 0F) {
    fun getFullInfo(): String {
        return "$pages pages, $author author, $$cost cost"
    }
}

class Booklet(pages: Int, cost: Float) : Book(pages, "", cost) {
    fun getUSDCost(): String {
        return "$$cost cost"
    }

    fun getEuroCost(): String {
        return "€$cost cost"
    }

    fun getTengeCost(): String {
        return "KZT$cost cost"
    }
}

fun main() {
    val marwinBooklet = Booklet(5, 46.12F)

    print(marwinBooklet.getTengeCost())
}

