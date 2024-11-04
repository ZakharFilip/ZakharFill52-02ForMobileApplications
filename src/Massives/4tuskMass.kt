package Massives

fun main() {

    val testarray1 = intArrayOf(1, 2, 3, 2, 0)
    val testarray2 = intArrayOf(5, 1, 2, 7, 3, 2, 2)
    //Сделать заполнение массивов вручную


    val intersection = findIntersection(testarray1, testarray2)


    println("Пересечение массивов: ${intersection.joinToString(", ")}")
}


fun findIntersection(array1: IntArray, array2: IntArray): IntArray {

    val frequencyMap = mutableMapOf<Int, Int>()

    for (num in array1)
    {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    val intersection = mutableListOf<Int>()

    for (num in array2) {
        if (frequencyMap.containsKey(num) && frequencyMap[num]!! > 0) {
            intersection.add(num)

            frequencyMap[num] = frequencyMap[num]!! - 1
        }
    }

    return intersection.toIntArray()
}