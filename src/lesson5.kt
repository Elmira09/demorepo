

fun main () {

    val score = 75

    if(score >= 90 && score <= 100){
        println("5")
    }else if (score >= 70  && score < 89){
        println("4")
    }else if (score >= 50 && score > 70){
        println("3")
    }else if (score>=30 && score <50){
        println("3")
    }else if (score >= 0 && score < 30){
        println("1")
    }
}
