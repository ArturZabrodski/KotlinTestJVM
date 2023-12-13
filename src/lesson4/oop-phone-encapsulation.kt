package lesson4

open class Phone(var name: String) {

    fun on() {
        println("$name включается")
    }

    fun off() {
        println("$name выключается")
    }

    fun call(to: String) {
        println("звонит $to")
    }

    open fun sendSMS(text: String, to: String) {
        println("$name отправляет $text адресату: $to")
    }

    open fun waterproof(){
        println(false)
    }
}

open class Samsung(name: String) : Phone(name) {
    override fun sendSMS(text: String, to: String) {
        println("$name не может отправлять смс")
    }

    override fun waterproof(){
        println(true)
    }
}

open class Asus(name: String) : Phone(name) {
    open fun enableEconomMode() {
        println("$name включает режим энергосбережения")
    }
}

fun main() {
    val samsung = Samsung("Samsung")

    samsung.waterproof()
    samsung.on()
    samsung.off()
    samsung.call("user 1")

    val asus = Asus("Asus")

    asus.waterproof()

    samsung.sendSMS("текст", "user 1")

    asus.on()
    asus.off()
    asus.call("user 3")
    asus.sendSMS("poka vse norm", "user 4")
    asus.enableEconomMode()
}