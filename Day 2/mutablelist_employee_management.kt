/*
Question

Create a mutable list containing "Alex", "John", "Sarah", and "David".

Perform the following operations:
1. Add "Michael" to the list.
2. Insert "Robert" at index 1.
3. Remove "John" by name.
4. Remove the employee at index 2.
5. Rename the employee at index 0 to "James".
6. Check whether "Sarah" exists in the list.
7. Print the final employee list and employee count.

Bonus: Create another mutable list containing "Oliver", "Emma", and "Daniel". Combine both lists using a built-in MutableList operation. Do not manually add each employee.
*/

fun main() {
    val employees = mutableListOf("Alex", "John", "Sarah", "David")
    val newEmployees = mutableListOf("Oliver", "Emma", "Daniel")

    employees.add("Michael")
    employees.add(1, "Robert")
    employees.remove("John")
    employees.removeAt(2)
    employees[0] = "James"

    if (employees.contains("Sarah")) {
        println("Sarah exists as an employee")
    } else {
        println("Sarah dosen't exists as an employee")
    }

    employees.addAll(newEmployees)

    println("final employee list: $employees")
    println("employee count: ${employees.size}")
}