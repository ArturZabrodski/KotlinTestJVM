package lesson8

import kotlin.math.roundToInt


/**
 * К слову о звездолетах и пришельцах. Благодаря помощи с обучением молодого поколения,
 * пришельцы передали человечеству технологию сверхсветовых двигателей. Однако при ближайшем
 * рассмотрении оказалось, что двигатели не являются надежными в техническом плане
 * (могут расплавить крепление и улететь в космос по своим делам) и по одиночке не работают.

Чтобы пилоты-испытатели не оказались слишком далеко от Земли в неисправном корабле,
реализуйте функцию engineStatus(engineNumber:Int): String, которая делает безопасный
(с точки зрения необработанных исключений) вызов функции rawEngineStatus(engineNumber:Int):String :

если произошло исключение EngineNotFoundException, то вернуть строку "engine <number> not found";
если произошло исключение SensorsMeltException, то вернуть строку "engine <number> offline";
если не произошло исключение, то вернуть результат работы rawEngineStatus.
где <number> - номер двигателя.
 */

class EngineNotFoundException : Exception()
class SensorsMeltException : Exception()

fun main() {
    for (i in 0..12) {
        println(engineStatus(i))
    }
}

fun engineStatus(engineNumber: Int): String {
    try {
        return rawEngineStatus(engineNumber)
    } catch (e: EngineNotFoundException) {
        return "engine ${engineNumber} not found".toString()
    } catch (e: SensorsMeltException) {
        return "engine ${engineNumber} offline".toString()
    }
    return "I don't know anything about space engines!".toString()
}


fun rawEngineStatus(engineNumber: Int): String {
    val status: Int = (Math.random() * 10).roundToInt()
    when (status) {
        in 0..2 -> return "Engine number ${engineNumber} - OK"
        in 3..5 -> throw EngineNotFoundException()
        else -> throw SensorsMeltException()
    }
}