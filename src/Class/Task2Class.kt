package Class
fun main() {

    println("Введите координаты первой точки")
    print("x1:")
    val x1=readLine()
    print("y1:")
    val y1=readLine()
    val point1 = Dot(x1!!.toDouble(), y1!!.toDouble())


    println("Введите координаты первой точки")
    print("x1:")
    val x2=readLine()
    print("y1:")
    val y2=readLine()
    val point2 = Dot(x2!!.toDouble(), y2!!.toDouble())

    val distance = point1.distanceTo(point2)
    println("Расстояние между точками $point1 и $point2 равно: $distance")
}