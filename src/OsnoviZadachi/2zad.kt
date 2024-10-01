package OsnoviZadachi

//НЕ ГОТОВО!!!
fun main() {
    var str: String = readln()

    var Vivod: String = ""

    var _char: Char = '_'
    var counter1 = 0
    var countermain = 0

    while (counter1 < str.length) {
        val SpecChar: Char = str[counter1]
        var tempStr = str


        for (item in counter1 + 1 until str.length) {
            if (str[item] == SpecChar) {
                tempStr = tempStr.replaceRange(item, item + 1, _char.toString())
                countermain++
            }
        }

        if (SpecChar != _char) {
            Vivod += SpecChar.toString() + countermain
        }

        str = tempStr
        counter1++
        countermain = 0
    }

    println(Vivod)
}