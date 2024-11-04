package Massives

val scanner = java.util.Scanner(System.`in`)

fun main() {

    println("Сколько строк:")
    val rows = scanner.nextInt()

    println("Сколько столбцов:")
    val cols = scanner.nextInt()

    val array = Array(rows) { IntArray(cols) }

    println("Введите $rows * $cols трехзначных чисел:")
    for (i in 0 until rows)
    {
        for (j in 0 until cols)
        {

            array[i][j] = scanner.nextInt()
        }
    }


    println("Массив:")
    for (i in array.indices) {
        for (j in array[i].indices) {
            print("${array[i][j]} ")
        }
        println()
    }


    val uniqueDigits = mutableSetOf<Char>()


    for (i in array.indices) {
        for (j in array[i].indices) {

            val numberStr = array[i][j].toString()
            for (digit in numberStr) {

                uniqueDigits.add(digit)
            }
        }
    }


    println("В массиве использовано ${uniqueDigits.size} различных цифр.")
}
