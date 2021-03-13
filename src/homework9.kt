


fun main () {

    for (i in 0..3) {
        for (j in 0..4) {
            print("*")
            print(" ")

        }
        println(" ")

    }
    val n: Int = 5

    for (i in 0..n){
        for (j in 0 until n - i){
            print("  ")
        }
        for (j in i downTo 1){
            print("* ")
        }
        println()
    }


}




