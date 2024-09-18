package OsnoviZadachi

fun main() {
var str= readln()
    var Vivod:String=""
    var SpecChar: Char
    var countermain = 0
var counter1 = 0
    var counter2 = 0
var count = 0

    var III:Int=str.length

    for (  item in 1..III)
    {
        SpecChar = str[counter1]
        for (item1 in str)
        {
            if (str[counter2]==SpecChar )
            {
                countermain++
            }

        }
        Vivod=Vivod+SpecChar+countermain
        counter2=0
        countermain=0
        counter1++
    }
println(Vivod)

}


