package Massives

fun main() {

    val testarray1 = intArrayOf(1, 2, 3, 2, 0)
    val testarray2 = intArrayOf(5, 1, 2, 7, 3, 2, 2)
    //Сделать заполнение массивов вручную


    val intersection = findIntersection(testarray1, testarray2)


    println("Пересечение массивов: ${intersection}")
}


fun findIntersection(array1: IntArray, array2: IntArray): String {
    val frequencyList= mutableListOf(0)

    for (i in 0..array1.size )
    {
        for (j in 0..array2.size)
        {
           if (array1[i]==array2[j])
           {frequencyList.add(array1[i]) }
        }
    }
 var vivod: String="";
    for (i in 0..frequencyList.size)
    {
        vivod= vivod +frequencyList[i]
        vivod= vivod + " "
    }

    return vivod
}