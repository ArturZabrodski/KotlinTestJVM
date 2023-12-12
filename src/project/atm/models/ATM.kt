package project.atm.models

import project.atm.utils.viewMainMenu
import project.atm.utils.viewSubMenu

class ATM {
    val accounts: List<Account>
    lateinit var account: Account
    var customerNumber: Int = -1
    var pinNumber: Int = -1

    constructor(accounts: List<Account>) {
        this.accounts = accounts
    }

    fun start() {
        var flag = 1

        do {
            // Запустить "Приветствие"
            println("Добро пожаловать в проект ATM!")

            try {
                // Запустить ввод данных и их проверку
                print("Введите номер своей карты: ")
                customerNumber = readLine()!!.toInt()

                print("Введите пин-код своей карты: ")
                pinNumber = readLine()!!.toInt()
            } catch (e: Exception) {
                start()
            }


            if (customerNumber == 0 && pinNumber == 0) {
                stop()
            }

            accounts.forEach {
                if (it.customerNumber == customerNumber && it.pinNumber == pinNumber) {
                    println("Проверка пройдена")
                    this.account = it
                    mainMenu(account)
                }
            }
            println("Проверка не пройдена")
        } while (flag == 1)
    }

    fun mainMenu(account: Account) {
        viewMainMenu()
        var selection: Int = -1

        try {
            selection = readLine()!!.toInt()
        } catch (e: Exception) {
            mainMenu(account)
        }

        when (selection) {
            1 -> menuCheckingAccount(account)
            2 -> menuSavingAccount(account)
            3 -> {
                println("Спасибо за использование нашего ATM")
                stop()
            }
            else -> {
                println("Ваш номер не верный!\n")
                mainMenu(account)
            }
        }
    }

    fun menuCheckingAccount(account: Account) {
        viewSubMenu("основного")

        var selection: Int = -1

        try {
            selection = readLine()!!.toInt()
        } catch (e: Exception) {
            menuCheckingAccount(account)
        }

        when (selection) {
            1 -> {
                println("Баланс основного аккаунта ${account.checkingBalance}")
                menuCheckingAccount(account)
            }
            2 -> {
                account.getCheckingWithdraw()
                menuCheckingAccount(account)
            }
            3 -> {
                account.getCheckingDeposit()
                menuCheckingAccount(account)
            }
            4 -> mainMenu(account)

            else -> {
                println("Ваш номер не верный!\n")
                menuCheckingAccount(account)
            }
        }
    }

    fun menuSavingAccount(account: Account) {
        viewSubMenu("сберегательного")

        var selection: Int = 0

        try {
            selection = readLine()!!.toInt()
        } catch (e: Exception) {
            menuSavingAccount(account)
        }

        when (selection) {
            1 -> {
                println("Баланс сберегательного аккаунта ${account.savingBalance}")
                menuSavingAccount(account)
            }
            2 -> {
                account.getSavingWithdraw()
                menuSavingAccount(account)
            }
            3 -> {
                account.getSavingDeposit()
                menuSavingAccount(account)
            }
            4 -> mainMenu(account)

            else -> {
                println("Ваш номер не верный!\n")
                menuSavingAccount(account)
            }
        }
    }

    fun stop() {
        println("Stopping system...")
        System.exit(0)
    }


}