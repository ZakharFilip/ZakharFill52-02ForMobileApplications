package Functions

fun main()
{
    var userTrow:Int;
    var compTrow:Int;

    compTrow=(1..3).random()
    println("Выбирай" +
            "1-камень" +
            "2-ножницы" +
            "3-бумага");
    userTrow= readln().toInt();
}

public fun Trow(TrowC:Int,TrowU: Int ):Int
{
   var resoult:Int=0;
    when(TrowU)
    {
        TrowC -> resoult = 0
       // 1 && TrowC==3 -> resoult = 0


    }

return resoult;
}