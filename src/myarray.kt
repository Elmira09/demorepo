

fun main(){
                    //arrayOf
    //Создадим массив и получим значение третьего элемента
    //val myArray = arrayOf(1,2,3,4,5)
    //println(myArray[2])        //3

    //Узнать длину массива можно узнать при помощью свойства size
    //val myArray = arrayOf(1,2,3,4,5)
    //println(myArray.size)       //5


   // А что случится, если добавим в массив строки?
    //val myArray = arrayOf(1,2,3,4,5, "Зайчик", "вышел", "погулять")
    //println(myArray[5])      //Зайчик
    //У нас получился массив смешанного типа.Все работает


    //Если мы хотим строгого поведения и не хотим смешивать раные типы, то используем обобщения
    //val myArray=arrayOf<Int>(1,2,3,4,5)
   // println(myArray[1])    //2


    /*Существует такжк синонимы метода, когда уже имени
    содержитсяподсказка: intArrayOf(), harArrayOf(), booleanArrayOf(),
    longArrayOf(), shortArrayOf(), byteArrayOf()
     */


                       //intArrayOf
    /* Пройтись по элементам массива и узнать значение индекса можно
    с помощью метода withIndex() */
   /* val numbersArray= intArrayOf(1,2,3,4,5)
    for ((index, value) in numbersArray.withIndex()) {
        println("Значение индекса $index равно $value")
    }*/
    //Значение индекса 0 равно 1
    //Значение индекса 1 равно 2
    //Значение индекса 2 равно 3
    //Значение индекса 3 равно 4
    //Значение индекса 4 равно 5


    // У массива есть свойство indices и мы можем переписать пример по другому
    //val numbersArray = intArrayOf(1,2, 3, 4, 5)
    //for(index in numbersArray.indices){
    //    println("Значение индекса $index равно ${numbersArray[index]}")
    //}

    //Значение индекса 0 равно 1
    //Значение индекса 1 равно 2
    //Значение индекса 2 равно 3
    //Значение индекса 3 равно 4
    //Значение индекса 4 равно 5








}