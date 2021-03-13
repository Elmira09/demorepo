import kotlin.math.*

fun main () {
    val x = readLine()!!.toDouble()
    val y = readLine()!!.toDouble()
    val r = readLine()!!.toDouble()
    val h = sqrt(x*x + y*y)
    when{
        h>r -> println(" Точка находиться за пределами круга")
        h<r ->println(" Точка принадлежит кругу")
    }

}