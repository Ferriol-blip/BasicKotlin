package oo

//1.constructors and methods
//2.class and open class
//3.abstract class and functions, la clase padre no se puede instanciar. Las funciones abstractas no tiene cuerpo, se especifican en la herencia.
//Una clase abstracta acepta metodos con open, abstract y normales

/*open*/ abstract class Person(open val name: String, open val age: Int, open var state: String = "Ok") {
    //val name: String
    //private var age: Int
    private var operative: Boolean

    init {
        //this.name = name
        //this.age = age
        this.operative = false
        println("Object created")
    }

    //abstract method
    abstract fun speak()

    open fun getYear(): Int {
        return this.age
    }

    fun setOperative(opt: Boolean) {
        this.operative = opt
    }

    fun getOperative(): Boolean {
        return this.operative
    }

}

//inheritance
class Student(override val name: String, override val age: Int, val studentId: Int) : Person(name, age) {
    //must override and make corpse to method
    override fun speak() {
        println("Hiiii")
    }
}

fun main() {
    //   val person = Person("Kevin", 50)
    //   val person1 = Person("Mouruce", 50, "SoSo")
    val student = Student("Marco", 24, 5000)
    student.setOperative(true)
    student.speak()
    println(student.studentId)
    showData(student)
    //   person.speak()
    //   person1.speak()
    //   person.setOperative(true)
    //   showData(person)
    //   showData(person1)
}

fun showData(person: Person) {
    println(person.getYear())
    println(person.name)
    println(person.state)
    println(person.getOperative())
}
