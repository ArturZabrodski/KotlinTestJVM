package project.atm

class ATM {
    val accounts: List<Account>

    constructor(accounts: List<Account>) {
        this.accounts = accounts
    }

    fun start() {
        var flag = 1

        do {
            // Запустить "Приветствие"
            println("Добро пожаловать в проект ATM!")

            // Запустить ввод данных и их проверку
            println("Введите номер своей карты: ")
            var customerNumber = readLine()!!.toInt()

            println("Введите пин-код своей карты: ")
            var pinNumber = readLine()!!.toInt()

            if (customerNumber == 0 && pinNumber == 0) {
                stop()
            }

            accounts.forEach {
                if (it.customerNumber == customerNumber && it.pinNumber == pinNumber) {
                    println("Проверка пройдена")
                    mainMenu()
                }
            }
            println("Проверка не пройдена")
        } while (flag == 1)
    }

    fun mainMenu() {}

    fun menuCheckingAccount() {}

    fun menuSavingAccount() {}

    fun stop() {
        println("Stopping system...")
        System.exit(0)
    }


}