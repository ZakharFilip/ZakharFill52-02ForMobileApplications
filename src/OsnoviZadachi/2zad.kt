package OsnoviZadachi

fun main() {
    var str:String = readln()

    var Vivod:String=""


    var SpecChar: Char
    var _char: Char='_'
    var countermain = 0
    var counter1 = 0
    var counter2:Int= 0
    var count = 0

    var III:Int=str.length

    while (true)
    {
        if ( str[counter1]=='_' )
        {}
        else {
            SpecChar = str[counter1]
            for (item in 1..III) {
                if (str[item] == SpecChar) {
                    str[item] = _char
                    countermain++
                }
            }
            Vivod=Vivod+SpecChar+countermain
        }

        counter1++
    }
}
