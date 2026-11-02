// Question: Create an Employee class with name, designation, and salary. Add methods to display employee details and calculate annual salary. Create two employee objects.

fun main() {
    val emp1 = Employee("Shravan", "Android Developer", 38000.0)
    val emp2 = Employee("Alex", "Flutter Developer", 45000.0)

    emp1.displayEmployeeDetails()
    emp1.annualSalary()

    emp2.displayEmployeeDetails()
    emp2.annualSalary()
}

class Employee(
    var name: String,
    var designation: String,
    var salary: Double
) {
    fun displayEmployeeDetails() {
        println("$name is a $designation who earns a salary of $salary")
    }

    fun annualSalary() {
        println("$name's annual salary would be " + salary * 12)
    }
}