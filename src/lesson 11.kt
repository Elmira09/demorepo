


var myMap: HashMap<String, String>? = null

fun main(){
    val names = arrayOf("KG","RU","USA","TR")
    val codes = arrayOf("+996", "+7", "+1", "+98")
    myMap= HashMap()

    codes.indices.forEach{
        myMap?.put(names[it], codes[it])
    }
    myMap?.forEach{
        println("key=${it.key}, value = ${it.value}")
    }
}