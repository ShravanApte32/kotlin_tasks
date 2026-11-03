/*
Question:
Create two interfaces:

Connectable
Function connect() with a default implementation printing "Device connected".

Configurable
Function configure() with a default implementation printing "Device configured".
Function status() with a default implementation printing "Configuration complete".

Create a class SmartHomeDevice implementing both interfaces.

Requirements:
Override connect() with a custom message.
Do not override configure() or status().

Create an object in main() and call all three functions.

Bonus:
Inside the overridden connect(), invoke the original interface implementation using super.
*/

fun main() {
    val device = SmartHomeDevice()

    device.connect()
    device.configure()
    device.status()
}

interface Connectable {
    fun connect() {
        println("Device connected")
    }
}

interface Configurable {
    fun configure() {
        println("Device configured")
    }

    fun status() {
        println("Configuration complete")
    }
}

class SmartHomeDevice : Connectable, Configurable {
    override fun connect() {
        super<Connectable>.connect()
        println("Your device is connected successfully")
    }
}