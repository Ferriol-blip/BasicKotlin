package loop

fun main() {
    val list = listOf<Int>(1,2,3,4,5,6)
    for (i in list.size downTo 0){
        print(i)
    }
    for (i in list.indices){
        print(i)
    }
    for (i in 0 until list.size-1){
        print(i)
    }
}
