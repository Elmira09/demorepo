import kotlin.math.*
/*Напишите программу: Мой возраст. Для заданного 1 < n < 200
  число не может быть больше 200 или меньше 1
  вывести сообщение в случае невыполнения условия,
  рассматриваемого как возраст человека, вернуть строку вида:
   «21 год», «32 года», «12 лет».
 */
fun main (){
    val age = readLine()!!.toInt()
    if( age >= 1 && age <= 200) {
        val lastDigit: Int = age % 10
        println(lastDigit)
        var ageStr = ""


        if (age - lastDigit == 10 || age - lastDigit == 110) {
            ageStr = " лет"

        } else if (lastDigit == 0) {
            ageStr = "  лет"

        } else if (lastDigit == 1) {
            ageStr = " год "

        } else if (lastDigit <= 4) {
            ageStr = " года"

        } else {
            ageStr = " лет"

        }
        println(" Вывод: $age - $ageStr")
    } else {
        println (" число не может быть больше 200 или меньше 1")
    }
}