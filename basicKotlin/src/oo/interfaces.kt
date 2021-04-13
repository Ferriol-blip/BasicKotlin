package oo

//las interfaces siempre son abstractas

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build();
}

class Car(val color: Color, override val timeRequired: Int) : Driveable, Buildable {
    override fun drive() {
        print("Driving car..")
    }

    override fun build() {
        print("build a new car")
    }
}


class Moto(val color: Color) : Driveable {
    override fun drive() {
        print("Drving moto")
    }

}

fun main(args:Array<String>) {
    val car: Driveable = Car(Color.BLUE, 120)
    car.drive()
    val moto: Driveable = Moto(Color.RED)
    moto.drive();
}
