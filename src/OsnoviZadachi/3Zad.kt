package OsnoviZadachi
fun main() {
    var need:String=""
    var str: Int = readln().toInt()
    var sec:Int
    while (str>1)
    {
       sec=str%2
        need=need+sec
        str/2
    }

    for (item in need.length..1 step -1 )
    {
    println(need[item])
    }
}



