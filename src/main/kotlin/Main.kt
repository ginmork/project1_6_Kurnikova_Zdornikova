fun main(args: Array<String>) {
    println("Введите первое число:")
    var num1: String = readln()
    println("Введите второе число:")
    var num2: String = readln()
    var result: String = ""

    if (num1.toInt()%2 == 0 && num2.toInt()%2== 0 )
        println("Нечетного числа не существует")

    else if (num1.toInt()%2 != 0)
        result = num2 + num1

    else if (num2.toInt()%2 != 0)
        result = num1 + num2
        println("нечетное число из введенных цифр" + result)

}