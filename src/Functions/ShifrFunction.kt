package Functions

fun main() {
    val AlphabetString = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    var mass: String
    var vivod = "После Шифровки: "

    // Шифровка
    println("Введите Строку для шифровки:")
    mass = readLine() ?: ""

    var halper: Int
    val lengthMass = mass.length
    val lengthAlphabet = AlphabetString.length

    for (i in 0 until lengthMass) {
        for (m in 0 until lengthAlphabet) {
            if (mass[i] == AlphabetString[m]) {
                halper = if (m + i > 32) 0 + i else m + i
                vivod += AlphabetString[halper]
                break
            }
        }
    }
    println(vivod)
    vivod = "После Дешифровки: "
    println("Введите Строку для дишифровки:")
    mass = readLine() ?: ""

    for (i in 0 until mass.length) {
        for (m in 0 until AlphabetString.length) {
            if (mass[i] == AlphabetString[m]) {
                halper = if (m - i < 0) 33 - i else m - i
                vivod += AlphabetString[halper]
                break
            }
        }
    }
    println(vivod)
}