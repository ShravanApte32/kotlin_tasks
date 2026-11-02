// Question: Create a parent reference pointing to a child object. Demonstrate how an overridden method executes based on the actual object type.

fun main() {
    val car: Vehicle = Car("BMW", "M3", 1998)

    car.startEngine()
}

open class Vehicle {
    open fun startEngine() {
        println("Vehicle engine started")
    }
}

class Car : Vehicle() {
    override fun startEngine() {
        println("Car engine started")
    }
}