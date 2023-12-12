fun main(args: Array<String>) {

// Напишите программу, которая считывает два числа и выводит true,
// если первое из них больше второго и false, если это не так
    var a1 = scan.nextInt()
    var b1 = scan.nextInt()

    println(a1 > b1 || false)
    println(a1 > b1)


// Напишите программу, которая считывает два числа и выводит false,
// если они равны и true, если они не равны.
    var a2 = scan.nextInt()
    var b2 = scan.nextInt()

    println(if (a2 == b2) false else true)
    println(a2 != b2)


// С помощью оператора ! можно изменить значение Boolean на противоположное.
// Например, если переменная b равна true, то !b равняется false.
    var a = 20
    var b = 30
    var c = (a > b)
    println(!c)
}