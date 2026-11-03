/*
Question

Given a list of salaries:
val salaries = listOf(25000, 45000, 60000, 80000)

Use a for loop and an if condition to print only salaries greater than 50000.
*/
fun main() {
    val salaries = listOf(25000, 45000, 60000, 80000)
    for (i in salaries) {
        if (i > 50000) {
            println(i)
        }
    }
}