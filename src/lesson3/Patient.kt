package lesson3

/**
 * Дополните toString
 *
 *     Если пациент инфицирован:Пациент(970827356789, Ахметов Серик, 24, инфицирован)
 *     Если пациент здоров: Пациент(970827356789, Ахметов Серик, 24, здоров)
 *
 */

class Patient() {
    private var firstName: String? = null
    private var lastName: String? = null
    private var iin: String? = null
    private var age: Int? = null
    private var weight: Int? = null
    private var height: Int? = null
    private var infected: Boolean? = null

    constructor(weight: Int, height: Int) : this() {
        this.weight = weight
        this.height = height
    }

    constructor(
        firstName: String, lastName: String, iin: String,
        age: Int, weight: Int, height: Int, infected: Boolean
    ) : this() {
        this.firstName = firstName
        this.lastName = lastName
        this.iin = iin
        this.age = age
        this.weight = weight
        this.height = height
        this.infected = infected
    }

    fun getFirstName(): String? {
        return firstName
    }

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun getLastName(): String? {
        return lastName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun getIIN(): String? {
        return iin
    }

    fun setIIN(iin: String) {
        this.iin = iin
    }

    fun getAge(): Int? {
        return age
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getWeight(): Int? {
        return weight
    }

    fun setWeight(weight: Int) {
        this.weight = weight
    }

    fun getHeight(): Int? {
        return height
    }

    fun setHeight(height: Int) {
        this.height = height
    }

    // индекс массы тела
    fun getBMI(): Double {
        return getWeight()!!.toDouble() / (getHeight()!!.toDouble() / 100 * getHeight()!!.toDouble() / 100)
    }

    fun isInfected(): Boolean? {
        if (getIsInfected() == true) return true
        else if (getIsInfected() == false) return false
        return null
    }

    fun getIsInfected(): Boolean? {
        return infected
    }

    fun setIsInfected(infected: Boolean) {
        this.infected = infected
    }

    override fun toString(): String {
        if (isInfected() == true) return "Пациент($iin, $firstName $lastName, $age, инфицирован)"
        return "Пациент($iin, $firstName $lastName, $age, здоров)"
    }
}

fun main() {
    var patient = Patient()

    patient.setFirstName("Marcus")
    patient.setLastName("Rashford")
    patient.setIIN("777777")
    patient.setAge(26)
    patient.setWeight(90)
    patient.setHeight(180)
    println(patient.getFirstName())
    println(patient.getLastName())
    println(patient.getIIN())
    println(patient.getAge())
    println(patient.getWeight())
    println(patient.getHeight())

    println(patient.toString())

    var patient2 = Patient(76, 187)

    println(patient2.getBMI())

    var patient3 = Patient("Marcus", "Rashford", "777777", 26, 90, 180, true)

    println(patient3.toString())
}