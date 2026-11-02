// Question: Create a function that accepts an employee's name and nullable age. Check whether the employee is eligible based on an age of 18 or above. Handle missing age.

fun main() {
    val name: String = "Shravan"
    val age: Int? = null

    checkEligibility(name, age)
}

fun checkEligibility(name: String, age: Int?) {
    if (age == null) {
        println("$name's age was not provided")
    } else {
        if (age >= 18) {
            println("$name is Eligible")
        } else {
            println("$name is not Eligible")
        }
    }
}