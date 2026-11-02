// Question: Create a parent class Vehicle with brand, model, and year of manufacture. Create child classes Car and Bike that inherit from Vehicle. Override startEngine() in both child classes with their own implementations. Create objects and call their respective methods.

fun main() {
    val car = Car("BMW", "M3", 1998)
    val bike = Bike("Dukati", "Aero", 1990)

    car.startEngine()
    bike.startEngine()
}

open class Vehicle(
    open val brand: String,
    open val model: String,
    open val yearOfManufacture: Int
) {
    open fun startEngine() {
        println("Vehicle engine started")
    }
}

class Car(
    override val brand: String,
    override val model: String,
    override val yearOfManufacture: Int
) : Vehicle(
    brand, model, yearOfManufacture
) {
    override fun startEngine() {
        println("pushed button ignition in the car")
    }
}

class Bike(
    override val brand: String,
    override val model: String,
    override val yearOfManufacture: Int
) : Vehicle(
    brand, model, yearOfManufacture
) {
    override fun startEngine() {
        println("self-start button pressed or kick-started the bike")
    }
}