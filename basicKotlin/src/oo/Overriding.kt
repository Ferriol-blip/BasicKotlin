package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("learning..")
    }
}

open class KotlinCourse() : Course("Kotlin", 20.00), Learnable {
    override fun learn() {
        super<Course>.learn();
        super<Learnable>.learn();
        println("learning kotlin..")
    }

    /* override final fun learn() {
        println("Learning Kotlin!")
    } */
}

class SpecialKotlin() : KotlinCourse() {
    override fun learn() {
        println("Learning special Kotlin")
    }
}

fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn();
}
