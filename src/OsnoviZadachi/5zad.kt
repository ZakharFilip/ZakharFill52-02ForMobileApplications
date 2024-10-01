package OsnoviZadachi

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    print("Введите число n: ")
    val n = scanner.nextInt()
    print("Введите основание степени x: ")
    val x = scanner.nextInt()

    var otvet = 1
    var y = 0
    while (otvet < n) {
        otvet *= x
        y++
    }
    if (otvet == n) {
        println("Целочисленный показатель степени y: $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}