package Functions

fun main() {
    val userString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    var mass: String
    var vivod = "После Шифровки: "

    // Шифровка
    println("Введите Строку для шифровки:")
    mass = readLine() ?: ""

    var halper: Int
    val lengthMass = mass.length
    val lengthUser = userString.length

    for (i in 0 until lengthMass) {
        for (m in 0 until lengthUser) {
            if (mass[i] == userString[m]) {
                halper = if (m + i > 32) 0 + i else m + i
                vivod += userString[halper]
                break
            }
        }
    }
    println(vivod)

    // Дешифровка
    vivod = "После Шифровки: "

    println("Введите Строку для дишифровки:")
    mass = readLine() ?: ""

    for (i in 0 until mass.length) {
        for (m in 0 until userString.length) {
            if (mass[i] == userString[m]) {
                halper = if (m - i < 0) 33 - i else m - i
                vivod += userString[halper]
                break
            }
        }
    }
    println(vivod)
}