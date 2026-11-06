/*
Question:

Create an Employee class using a private constructor and a companion object.

Requirements:
1. The Employee class should contain:
   - id: Int
   - name: String
   - salary: Double
2. Make its constructor private.
3. Inside the companion object:
   - Declare COMPANY_NAME as a constant with value "Tech Solutions".
   - Create createEmployee() that accepts employee details and returns an Employee object.
   - Create isValidSalary() that accepts a salary and returns true if it is greater than zero, otherwise false.
4. Create two employees using the factory method.
5. Print their details, company name, and salary validation results.

Expected output:
Employee ID: 101
Name: Shravan
Salary: 45000.0

Employee ID: 102
Name: Alex
Salary: 35000.0

Company: Tech Solutions
Is 25000.0 valid? true
Is -5000.0 valid? false
*/

class Employee private constructor(
    val id: Int,
    val name: String,
    val salary: Double
) {
    companion object {
        const val COMPANY_NAME = "Tech Solutions"

        fun createEmployee(id: Int, name: String, salary: Double): Employee {
            return Employee(id, name, salary)
        }

        fun isValidSalary(salary: Double): Boolean {
            return salary > 0
        }
    }
}

fun main() {
    val emp1 = Employee.createEmployee(101, "Shravan", 45000.0)
    val emp2 = Employee.createEmployee(102, "Alex", 35000.0)

    println("Employee ID: ${emp1.id}")
    println("Name: ${emp1.name}")
    println("Salary: ${emp1.salary}")
    println()

    println("Employee ID: ${emp2.id}")
    println("Name: ${emp2.name}")
    println("Salary: ${emp2.salary}")
    println()

    println("Company: ${Employee.COMPANY_NAME}")
    println("Is 25000.0 valid? ${Employee.isValidSalary(25000.0)}")
    println("Is -5000.0 valid? ${Employee.isValidSalary(-5000.0)}")
}
