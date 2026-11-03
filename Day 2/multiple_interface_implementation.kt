/*
Question:
Create two interfaces:

Playable with a function play().
Recordable with a function record().

Create a class SmartPhone that implements both interfaces and provides implementations for both functions.

In main(), create a SmartPhone object and call both functions.

Bonus:

Create two interface references (Playable and Recordable) pointing to the same SmartPhone object. Call the respective functions through each reference.
*/

fun main() {
    val phone = SmartPhone()

    val smartphone1: Playable = phone
    val smartphone2: Recordable = phone

    smartphone2.record()
    smartphone1.play()
}

interface Playable {
    fun play()
}

interface Recordable {
    fun record()
}

class SmartPhone : Playable, Recordable {
    override fun play() {
        println("play")
    }

    override fun record() {
        println("record")
    }
}