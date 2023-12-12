package lesson8

/**
 * Class, constructor, methods
 */

class Player(var str: Int = 0, var dex: Int = 0, var XP: Int = 0, var lvl: Int = 1,
             var nextLvlXP: Int = 10) {

    fun recieveXP(xp: Int) {
        XP += xp
        if (XP >= nextLvlXP) {
            lvlUP()
        }
        println("lvl=${lvl} str=${str} dex=${dex}")
    }

    private fun lvlUP() {
        lvl++
        str += if (lvl % 2 == 0) 1 else 0
        dex += if (lvl % 2 == 1) 1 else 0
        nextLvlXP += 100
    }
}

fun main() {
    var p: Player = Player(str = 2)

    p.recieveXP(10)
    p.recieveXP(100)
    p.recieveXP(100)
}