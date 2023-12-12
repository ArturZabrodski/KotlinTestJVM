package project.atm

import project.atm.models.ATM
import project.atm.models.Account

// internal - в рамках этого пакета
internal var data = mutableListOf<Account>()

fun main() {
    // Загрузить данные аккаунтов
    val c1 = Account(1234567, 9988)
    val c2 = Account(7654321, 8899)

    data.add(c1)
    data.add(c2)

    // Запуск приложения
    ATM(data).start()


}

