/*Создайте класс Кот со следующими полями: имя, возраст, уровень сытости,
уровень воды. И реализуйте в нем следующие методы: 1) вывод имени, возраста,
начального уровня сытости и уровня воды, 2) метод, меняющий параметры
сытости и воды и дальнейший их вывод;*/
class Cat(){
    var name: String = ""
    var age: Int= 0
        set(value){
            field += value
            when{
                age<0 -> {
                    println("Кот не родился")
                }
                age > 18 -> {
                    println("RIP")

                }
            }
        }
    var satiety = 50
        set(value:Int){
            if(thirst > 45){
                field -= value
            } else {
                field+= value
            }
            
        }
    var thirst=43
    set(value){
        if(satiety>50){
            field -= value
        }else{
            field += value
        }
    }

    override fun toString(): String {
        return "Имя: $name\n Возраст: $age\nУровень сытости: $satiety\nУровень жажды $thirst"


    }

    fun main(){
        val bars = Cat()
        bars.name="Murzik"
        bars.age= 4
        print(bars.toString())

        println()
        print(">------------------------------<")
        println()
        bars.age=5
        bars.thirst=5
        print(bars.toString())



        println()
        print(">--------------------------<")
        println()

        bars.satiety = 10
        bars.thirst = 5
        print(bars.toString())


    }

}