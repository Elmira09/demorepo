

fun main () {

    val score = 75

    when(score){
        in 90..100 -> println("5")
        in 80..79 -> println("4")
        in 50..69 ->println("3")
        in 30..49 ->println("2")
        in 0..29->println("1")
        else ->{
            println("score is invalid")
        }
    }

    when{
        3>2 ->println("3>2")
        "string".length ==6 -> println("length is 6")
        2>3 -> println("2>3")
        else -> {
            println("else called")
        }
    }


    val a =5
    val b = 3

    val maxValue = when (a>b) {
        true -> a
        false-> b
    }


    println("maxValue : $maxValue")
}