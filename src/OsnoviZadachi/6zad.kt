package OsnoviZadachi

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)


    print("Цифра 1: ")
    val digit1 = scanner.nextInt()
    print("Цифра 2: ")
    val digit2 = scanner.nextInt()

    if (digit1 % 2 != 0) {
        val num2 = digit2 * 10 + digit1
        println("Нечетное число: $num2")
    }else if (digit2 % 2 != 0) {
        val num1 = digit1 * 10 + digit2
        println("Нечетное число: $num1")
    } else {
        println("нельзя создать нечетное число")
    }
}