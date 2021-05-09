

/*fun main(){
    val person = Person("Asan", "Uson", 27 /* "KG"*/)

    println(person.name )
    println(person.surName)
    println(person.age)
    //println(person.address)

    person.introduceYourSelf()

    val employee = Employee("Elon", "Mask", 40, 48)

    println(employee.introduceYourSelf())

}


open class Person /*constructor*/(val name: String, val surName: String, val age: Int){
    /*var name: String = "John"
    var surName: String = "Doe"
    var age: Int = 27

    init{
        this.name = name
        this.surName= surname
        this.age= age

    }*/
    /*var address: String? = null
    constructor(name: String, surName: String, age: Int, address: String) : this(name,surName, age){
        this .address = address
    }*/


    open fun introduceYourSelf(){
        println("my name is $name, i love programming")
    }
}


class Employee(name: String,  surName: String,  age: Int, val experience:Int) : Person(name,surName,age){

    override fun introduceYourSelf() {
        println("my name is $name $surName, i Have $experience years of experience")
    }



}*/