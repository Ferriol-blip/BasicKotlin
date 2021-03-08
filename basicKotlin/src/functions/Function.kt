package functions

import java.util.*

fun helloWorld() {
    println("Hello World!")
}

fun printWithSpaces(text: String) {
    for (char in text) {
        print("$char ")
    }
    println()
}

fun getCurrentDate(): Date {
    return Date()
}

fun maxNumber(a: Int, b:Int): Int {
    return if (a >= b) a else b
}

fun main() {
    helloWorld()
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(maxNumber(2,3))
}

