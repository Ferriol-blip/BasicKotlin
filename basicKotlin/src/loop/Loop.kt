package loop

fun main() {
    //For
    //var sum: Int = 0
    // for (i in 1..10){
    //     sum++
    //     println("Hola $sum")
    // }
    val list = listOf("Java", "Kotlin", "Python")
    val arrayList = listOf("Java", "Kotlin", "Python")
    for (x in list) {
        println(x)
    }
    for ((index, value) in arrayList.withIndex()) {
        println("Element at $index is $value")
    }
    //While
    var x = 9
    while (x >= 0) {
        println(x)
        x--
    }
    //Use break and continue
    for (char in "Kotlin") {
        if (char == 'l') break
        print(char)
    }
    val listStrings = listOf("Hola", "Adios", "Quiza")
    for (str in listStrings) {
        if (!str.contains("l")) continue
        print(str)
    }
    //Naming loops
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i - j == 5) break@outer
            println("$i --- $j")
        }
    }

}
