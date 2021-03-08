package conditional

fun main() {

    //Sintaxis condicionales

    val age = 25
    val mode = 3
    var i : Int? = null

    if (age < 18) {
        println("message1: menor")
    } else if (age in 20..25) {
        println("message1: algo")
    } else {
        println("message1: meh")
    }

    if (age in 0..17) println("meesage2: menor") else println("message2: mayor")

    //When
  // when (mode) {
  //     1 -> print("Is ok")
  //     2 -> print("Is error")
  //     3 -> {
  //         print("Error 500")
  //         print("Error 400")
  //     }
  //     else -> print("not reco")
  // }

     val message = when (mode) {
        1 -> "Is ok"
        2 -> "Is error"
        3 -> {
            i = 3
            "Error 400"
        }
        else ->  "not reco"
    }

    println(message)

    val x = if (i == 3) "Hi" else "Bye"

    println(x)

    //Posibilidades de condicion en when
    val y: Int = 4
    when(y){
        !in 1..5 -> println("Can use ranged, not is 1..5")
        2*1 -> println("Is 2")
        "Hola".length -> println("Can use functions, ej lenght")
    }
}
