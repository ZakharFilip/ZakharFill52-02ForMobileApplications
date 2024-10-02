package Massives

import java.util.*

fun main()
{
    val scanner = Scanner(System.`in`)
    var stroks:Int
    stroks=scanner.nextInt()


    var stolbs:Int
    stolbs= scanner.nextInt()


    var greatArray: Array<Array<Int>> =Array(size = stroks) {
     Array(size = stolbs) {(0..999).random() //Cюда пичсать код для заполнения массива}
   }


}