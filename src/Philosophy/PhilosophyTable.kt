package Philosophy
import kotlin.random.Random
fun main()
{
    println("Сколько философов село за стол? (написать 0, чтобы случайное колличество):")
    var philosofSumm: Int;
    var A: String;

    A = readLine() ?: "Цифру введи"

    if (A=="0") { philosofSumm = Random.nextInt(1, 10000) }
    else{philosofSumm = A.toInt()}

    println("Село за стол "+philosofSumm+" философов")
    var tableArray = Array(philosofSumm+2) { IntArray(3) }
    tableArray[0][2]=2;
    tableArray[philosofSumm++][2]=2;

    for (i in 1 until tableArray.size-1)
    {
        tableArray[i][0]=1;//слева
        tableArray[i][1]=1;//справа
        tableArray[i][2]=1;//без вилки
    }
    var b:Int = Random.nextInt(1, philosofSumm)
    println("Начал "+b+" философ первый начал выбирать вилку")

    var EatCounter:Int=0;

//ОТ ЧИСЛА ДО ПРАВА
    for (i in b until tableArray.size-1)
    {
        if (Random.nextInt(1, 2)==1)
        {
           if ( tableArray[i][0]==0)
           {
               if (tableArray[i][1]==0)
               {

               }
               else{ tableArray[i][1]=0
                     tableArray[i][2]=0
                     tableArray[i+1][0]=0
                   EatCounter++
                }
           }
            else{
               tableArray[i][0]=0
               tableArray[i][2]=0
               tableArray[i-1][1]=0
               EatCounter++
            }

        }
        else{
            if ( tableArray[i][1]==0)
        {
            if (tableArray[i][0]==0)
            {

            }
            else{ tableArray[i][0]=0
                tableArray[i][2]=0
                tableArray[i-1][1]=0
                EatCounter++
            }
        }
        else{
            tableArray[i][1]=0
            tableArray[i][2]=0
            tableArray[i+1][0]=0
                EatCounter++
        }
        }
    }
//ОТ ЛЕВА ДО ЧИСЛА
    for (i in 1 until b-1)
    {
        if (Random.nextInt(1, 2)==1)
        {
            if ( tableArray[i][0]==0)
            {
                if (tableArray[i][1]==0)
                {

                }
                else{ tableArray[i][1]=0
                    tableArray[i][2]=0
                    tableArray[i+1][0]=0
                    EatCounter++
                }
            }
            else{
                tableArray[i][0]=0
                tableArray[i][2]=0
                tableArray[i-1][1]=0
                EatCounter++
            }

        }
        else{
            if ( tableArray[i][1]==0)
            {
                if (tableArray[i][0]==0)
                {

                }
                else{ tableArray[i][0]=0
                    tableArray[i][2]=0
                    tableArray[i-1][1]=0
                    EatCounter++
                }
            }
            else{
                tableArray[i][1]=0
                tableArray[i][2]=0
                tableArray[i+1][0]=0
                EatCounter++
            }
        }
    }

philosofSumm=philosofSumm-EatCounter-1
    println("Когда все выбрали вилки, ели "+EatCounter+" философов")
    println("Другие "+philosofSumm+" размышляли")


}