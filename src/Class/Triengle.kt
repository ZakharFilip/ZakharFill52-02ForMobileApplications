package Class

import java.util.*
class Triengle(val a: Dot, val b: Dot, val c: Dot)
{

    private fun area(p1: Dot, p2: Dot, p3: Dot): Double {
        return Math.abs((p1.x *(p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) / 2.0)
    }

    fun contains(point: Dot): Boolean {

        val areaABC = area(a, b, c)
        val areaPAB = area(point, a, b)
        val areaPBC = area(point, b, c)
        val areaPCA = area(point, c, a)


        return areaABC == areaPAB + areaPBC + areaPCA
    }

}