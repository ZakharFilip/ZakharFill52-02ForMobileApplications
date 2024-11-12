package Functions

fun main() {
    var proverka: Int = 0;

    while (proverka == 0){
    var userTrow: Int;
    var compTrow: Int;

    compTrow = (1..3).random()
    println(
        "Выбирай" +
                "1-камень" +
                "2-ножницы" +
                "3-бумага"
    );
    userTrow = readln().toInt();

    when (Trow(compTrow, userTrow)) {
        1 -> proverka= 1
        2 -> println("Вы проиграли :(");
        0 -> println("Ничья :/");
    }
   }
    println("Вы выиграли :)")
}

public fun Trow(TrowC:Int,TrowU: Int ):Int
{
   var resoult:Int=0;

    when(TrowU)
    {
        TrowC -> resoult = 0
        1  -> if( TrowC==2){resoult = 1} else if(TrowC==2){resoult = 2};
        2  -> if( TrowC==3){resoult = 1} else if(TrowC==1){resoult = 2};
        3  -> if( TrowC==1){resoult = 1} else if(TrowC==2){resoult = 2};
    }

return resoult; // 1-выигрышь 2-проигрышь 0-ничья
}