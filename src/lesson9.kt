

fun main () {
    // For loop
    val names= arrayListOf ("Kotlin", "Java", "Dart")

    /*for (i in 0..2){                 //Kotlin
        println(names[i])              //Java
    }*/                                //Dart


    /*for (i in 0 until 3 ){           //Kotlin
        println(names[i])              //Java
    }*/                                //Dart


    /*for(i in 0 until names.size){    //Kotlin
        println(names[i])              //Java
    }  */                              //Dart


    /*for(name in names){             //Kotlin
        println(name)                 //Java
    }*/                               //Dart


// Arrayде иштегенде ишибизди онойлоткон функция  (forEach)
    /*for(i in 0 until names.size){    //Kotlin
        println(names[i])              //Java
    }  */                              //Dart
    /* names.forEachIndexed { index, name ->// 0 Kotlin
         println("$index $name")           //  1 Java
     }*/                                   //  2 Dart


    /*for(name in names){             //Kotlin
        println(name)                 //Java
    }                                 //Dart
    names.forEach {println(it)} */    //Kotlin
                                      //Java
                                      //Dart

    /*for(i in 0..10){
        println(i)
    }*/


    /*for(i in 0..10 step 2){
        println(i)
    }*/


    /*for(i in 10 downTo 0 step 2){
        println(i)
    }*/


    /*for(i in 0..10 ){     //keyword (continue and break)
        if(i==6) continue
        println(i)
    }*/

    /*for (i in 0..10){
        if(i==6) break
        println(i)
    }*/

    // while loop
   var j = 11
    while(j <= 10){
        println(" while $j")
        j++
    }



    //do while loop
    /*var k = 0
    do{
        println(k)
        k++
    } while(k <= 10)*/


    var k = 0
    var l = 0
    do{
        println("do while $k")
        k++
    } while(k <= 10)









}