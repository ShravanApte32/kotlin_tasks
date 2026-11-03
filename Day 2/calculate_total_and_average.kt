/*
Question

Given a list of salaries:
val salaries = listOf(25000, 45000, 60000, 80000)

Calculate:
The total salary.
The average salary.

Use a loop to calculate the total and then calculate the average outside the loop.
*/

fun main() {
    val salaries = listOf(25000, 45000, 60000, 80000)
    var total = 0
    var avg = 0.0

    for (i in salaries) {
        total += i
    }
    avg = total.toDouble() / salaries.size

    println("total: $total")
    println("average: $avg")
}