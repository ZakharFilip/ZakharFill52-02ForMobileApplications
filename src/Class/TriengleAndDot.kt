package Class

fun main() {

    println("Введите координаты треугольника:")
    println("Вершина A (x1):")
    val Ax1=readLine()
    println("Вершина A  (y1):")
    val Ax2=readLine()
    println("Вершина B (x2):")
    val Bx1=readLine()
    println("Вершина B (y2):")
    val Bx2=readLine()
    println("Вершина C (x3):")
    val Cx1=readLine()
    println("Вершина C (y3):")
    val Cx2= readLine()

    val triangle = Triengle(Dot(Ax1!!.toDouble(), Ax2!!.toDouble()), Dot(Bx1!!.toDouble(), Bx2!!.toDouble()), Dot(Cx1!!.toDouble(), Cx2!!.toDouble()))

    println("Введите координаты точки (x):")
    val Px= readln()
    println("Введите координаты точки (y):")
    val  Py = readln()

    val point = Dot(Px!!.toDouble(), Py!!.toDouble())


    if (triangle.contains(point)) {
        println("Точка ${point} находится внутри треугольника.")
    } else {
        println("Точка ${point} находится вне треугольника.")
    }
}