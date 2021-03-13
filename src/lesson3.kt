
var value: String?  = null

lateinit var lateValue: String

fun main() {


    value = "Kotlin"

    // safe call operator (?.)

   // println(value?.length)

    // Safe call with let (?.let)
    value?.let {
      //  println(it.length)
    }

    // Elvis operator (?:)
    val length = if(value != null){
        value!!.length
    } else{
        -1
    }
    //println(length)

    val length2 = value?.length ?: -1
   // println(length2)

    // Non null assertoin operator (!!)
    println(value!!.length)
    // lateinit keyword
    lateValue = "Java"
    println(lateValue.length)


}