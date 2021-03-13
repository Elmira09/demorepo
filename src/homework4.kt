import kotlin.math.*



fun main() {

    println("ax^2 + bx +c = 0")
    println("Введите a, b и c:")
val a: Double = readLine()!!.toDouble()
val b: Double = readLine()!!.toDouble()
val c: Double = readLine()!!.toDouble()
val d: Double = b * b - 4 * a * c
println("x1= ${(-b -  sqrt(d)) /(2*a)}")
println("x1= ${(-b +  sqrt(d)) /(2*a)}")
}



