/*
Question:

Given a list of employee salaries:
val salaries = listOf(18000, 25000, 32000, 45000, 60000, 75000)

- Filter salaries greater than or equal to 30,000.
- Increase the remaining salaries by 10%.
- Print each updated salary using forEach().
- Chain filter() and map().
*/

fun main() {
    val salaries = listOf(18000, 25000, 32000, 45000, 60000, 75000)

    val updated_salaries = salaries
        .filter { it >= 30000 }
        .map { it * 1.10 }

    updated_salaries
        .forEach { println("Updated Salary: $it") }
}