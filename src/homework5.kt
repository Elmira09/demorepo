import kotlin.math.*

/*Четырехзначное число назовем счастливым,
если сумма первых двух ее цифр равна сумме двух последних.
 Определить, счастливое ли заданное число, вернуть true,
  если это так.
 */

fun main() {
    println("Введите четырехзначное число")
    val num = readLine()!!.toInt()
    val result :Boolean
    if (num % 10 + num / 10 % 10 == num / 100 % 10 + num  / 1000){
        result = true
    }else {
        result =false
    }
    println(result)

}


