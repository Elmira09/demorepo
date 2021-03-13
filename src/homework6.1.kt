


fun main(){
    val month = readLine()!!.toInt()

    when (month) {
        1 -> println(" Месяц $month - 31 дней")
        2 -> println(" Месяц $month - 28 дней")
        3 -> println(" Месяц $month - 31 дней")
        4 -> println(" Месяц $month - 30 дней")
        5 -> println(" Месяц $month - 31 дней")
        6 -> println(" Месяц $month - 30 дней")
        7 -> println(" Месяц $month - 31 дней")
        8 -> println(" Месяц $month - 31 дней")
        9 -> println(" Месяц $month - 30 дней")
        10 -> println(" Месяц $month - 31 дней")
        11 -> println(" Месяц $month - 30 дней")
        12 -> println(" Месяц $month - 31 дней")
        else -> println( "Туура эмес")

    }
}