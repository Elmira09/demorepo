


fun main () {
    val array1 = intArrayOf(1,2,3)
    val array2 = intArrayOf(4,5,6)
    val array3 = IntArray(array1.size)
    for (i in array1.indices){
        array3[i] = array1[i] + array2[i]
    }
    for(i in array3.indices){
        print("${array3[i]}")
    }
}