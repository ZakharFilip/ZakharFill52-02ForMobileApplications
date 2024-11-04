package Class
import kotlin.math.sqrt
import kotlin.math.pow
class Dot(val x: Double, val y: Double)
{
    fun distanceTo(other: Dot): Double {
        return sqrt((other.x - this.x).pow(2) + (other.y - this.y).pow(2)) // Возвращаем расстояние
    }
}