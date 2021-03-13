fun main(){
    //Map
    val password = "12345"
    val username = "onepanchman_01"
    val name = "John"

    val list = arrayListOf("12345","onepanchman_01","John")

    //key value

    val myMap = hashMapOf<String,String>()

    myMap.put("password","12345")
    myMap.put("username","onepanchman_01")
    myMap.put("name","John")
    myMap.put("name2","John")
    myMap.put("name3","John")
    myMap.remove("name")


    println(myMap.entries)


    println(myMap.get("password"))

    //set

    val mySet = HashSet<Int>()


    val liist = arrayListOf(1, 2, 3, 4, 4, 4, 4, 1, 1)
    mySet.addAll(liist)

    println(mySet)



}