/*
Question:

Create a Student data class with:

- id: Int
- name: String
- marks: Double

Demonstrate:
- Creating a data class object.
- Printing objects using the automatically generated toString().
- Copying an object while changing its marks using copy().
- Comparing objects using equals() / ==.
- Destructuring an object into individual variables using componentN().
*/

fun main() {
    val stud1 = Student(101, "Alex", 85.5)
    val stud2 = stud1.copy(marks = 92.0)

    val (stud_id, stud_name, stud_marks) = stud2

    println(stud1)
    println(stud2)
    println(stud_name)
    println(stud_marks)
}

data class Student(
    val id: Int,
    val name: String,
    val marks: Double
)