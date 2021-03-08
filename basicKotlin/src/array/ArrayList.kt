package array

fun main() {
    val array = arrayOf("Texas","Iowa","California")
    val array1 = arrayOf("Nevada","Dublin")
    val list = listOf<String>("Orange","Apple","Bananas")
    val arraylist = arrayListOf("Juan","Jesus","Pablo")
    val numbers = intArrayOf(1,2,3,4)

    //handler arrays, lists
    arraylist.add("Pepe")
    array.set(0,"Hola")
    array[0] = "adios"

    //concatenar
    val concat = array + array1

    println(array[0])
    println(list[0])
    println(arraylist[0])
    println(numbers[0])
    println(concat.size)
    //empty
    val empty : Boolean = numbers.isEmpty()
    println(empty)
    //contains
    val contais = if (list.contains("Orange")) "Contiene Orange" else "No contiene orange"
    println(contais)
    //add arrayLists
    arraylist.add(2,"Menganito")
    arraylist.remove("Juan")
    arraylist.removeAt(1)
    val testRemoved = arraylist.remove("Pepe")
    println(arraylist)
    println(testRemoved)
    val subList = arraylist.subList(1,3)
    println(subList)
}
