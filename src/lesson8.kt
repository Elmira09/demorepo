
fun main () {

    // element 0 0 0 0 0
    // index   0 1 2 3 4

     val  myArray = arrayOf(1, 2, 3, 4, 5)

    myArray[0] = 42
    myArray[4]= 322

    println(myArray[4])

    val myArrayList = arrayListOf<String>("Javascript", "C")

    myArrayList.add("Kotlin")
    myArrayList.add("Java")
    myArrayList.add("Dart")

    myArrayList.add (1, "Python")

    myArrayList.remove("Java")

    println(myArrayList)

    println(myArrayList.size)
}