

//fun main(){
    //println("my first commit")
   // println("my first commit")

   // println("my first commit")
   // println("my first commit")
//}

/*fun main(){
    sayHelloKotlin()

}

fun sayHelloKotlin(){

    println("Hello Kotlin")        Hello Kotlin
}*/



/*fun main(){
    sayHelloKotlin("Kotlin")
    sayHelloKotlin("Java")
}

fun sayHelloKotlin(name:String){
    println("Hello $name! How are you?")  //Hello Kotlin!How are you?

}*/
   //for loop
/*fun main (){
    sayHelloKotlin("Kotlin", 3)

}

fun sayHelloKotlin(name: String, reps: Int){  //Hello Kotlin! Where are you?
                                              //Hello Kotlin! Where are you?
    for(i in 0 until reps)                    //Hello Kotlin! Where are you?
    println(" Hello $name! Whera are you?")


}*/
//while loop
/*fun main(){
    sayHelloKotlin("Kotlin", 3)

}

fun sayHelloKotlin(name: String, reps:Int){
    var counter = reps


    while(counter>0){
        println("Hello $name! Where are you?")  //Hello Kotlin! Where are you?
        counter--                               //Hello Kotlin! Where are you?
    }                                           //Hello Kotlin! Where are you?
}*/



/*fun main(){
    val max = getMax(5,6)
    println(max)

}
fun getMax(num1: Int, num2:Int ): Int{
    return if(num1 > num2)num1 else num2   //6
}*/


/*fun main(){
    val max = getMax(5,6)
    println(max)

}
fun getMax(num1: Int, num2:Int ): Int{
    return if(num1 > num2)
        num1
    else
        num2   //6
}*/


/*fun main(){
    println(getMax(5,6))

}
fun getMax(num1: Int, num2:Int ) = if(num1 > num2) num1 else num2   //6*/



/*fun main(){
    println(getMax(5,6))
    println(getMax(7.0, 9.0))
    println(getMax(3,4, 5))

}
fun getMax(num1: Int, num2:Int ) = if(num1 > num2) num1 else num2   //6
fun getMax(num1: Int, num2:Int, num3:Int): Int{
    return when{
        num1 > num2 && num1>num3 -> num1
        num2 > num2 && num2>num3 -> num2
        else -> num3
    }

}
fun getMax(num1:Double, num2:Double): Double{
    return if (num1> num2) num1 else num2
}*/
//7
//9.0
//5

/*fun main(){
    sayHello()
}
fun sayHello( name: String = "Hello", reps: Int = 2){
    var counter = reps

    while(counter >0){
        println("hello $name! Where are you?")
        counter--
    }
}*/    // Hello Kotlin! Where are you?
       // Hello Kotlin! Where are you?


/*fun main(){
    printInts(arrayOf(1,2,3))

}
fun printInts(ints:Array<Int>){
    for ( i in ints) println(i)
}*/   //1
      //2
      //3

//fun main(){
   /* val a = 6
    val b = 7
    val c = a + b + 10
    val str = c.toString()
    println(str)

    val numList = arrayOf(1, 2, 3)
    var x = 0
    while (x < 3){
        println("Item $x is ${numList[x]}")
        x= x +1
    }*/

/*fun main (args: Array<String>) {
    factorial(4)
    factorial(5)
    factorial(6)

}
fun factorial(n: Int){
    var result = 1;
    for( d in 1..n){
        result = result * d
    }
    println("factorial of $n is equal to $result")

}*/

/*fun main(args: Array<String>){
    displayUser("Tom", 23)
    displayUser("Alice", 19)
    displayUser("kate", 25)


}

fun displayUser ( name: String, age: Int){
    println("Name: $name Age: $age")

}*/

/*fun main(args: Array<String>){
    displayUser("Kate")
    displayUser( "Aida", 24, "manager")
    displayUser("Elmira", 26, "Programist")

}
fun displayUser( name: String, age: Int = 18, position: String = "unemployed"){
    println("Name: $name Age: $age, Position:$position")
}*/



/*fun main(){
    val name: String = "Okuuprogrammer50000"
    for (i in name.indices){
        if(i%2==0){
            println(name[i])
        }
    }
}*/

/*fun main(){
    val tom = Person("Tom", "Tim", 32)
    val tim = Person ("Tim", "Terner", 23)
    println(tom.toString())
    println(tim.toString())


}

data class Person( val name: String,
                   val surename: String,
                   val age: Int)

class Persons (val name: String, val surname: String, val age:Int)*/
/*fun main(){
    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    val c:Int = readLine()!!.toInt()
    sum(a, b, c)
}

fun sum(a: Int, b: Int, c:Int){
    if(a>b && b< c){
        print(a)
    }
}*/


fun main(){

    
    println()

}

















