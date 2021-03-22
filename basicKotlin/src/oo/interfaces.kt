package oo

//las interfaces siempre son abstractas

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build();
}

class Car(val color: String, override val timeRequired: Int) : Driveable, Buildable {
    override fun drive() {
        print("Driving car..")
    }

    override fun build() {
        print("build a new car")
    }
}


class Moto(val color: String) : Driveable {
    override fun drive() {
        print("Drving moto")
    }

}

fun main(args:Array<String>) {
    val car: Driveable = Car("blue", 120)
    car.drive()
    val moto: Driveable = Moto("red")
    moto.drive();
}
