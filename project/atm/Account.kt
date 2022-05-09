package project.atm

class Account(val customerNumber: Int, var pinNumber: Int) {

    var checkingBalance: Double = 0.0
        private set

    var savingBalance: Double = 0.0
        private set
}