fun main () {
    val a = 7

    val message =
        when {
            (a%2)==0 -> {
                println("a is even")
            }
            (a%5)==0 -> {
                println("a is divisible by 5")
            }
            else -> {
                println("a is not even and not divisible by 5")
            }
        }
}