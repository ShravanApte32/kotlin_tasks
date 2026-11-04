/*
Concepts Covered
- mapOf() and mutableMapOf()
- Key-value pairs
- Accessing values using [] and get()
- containsKey() and containsValue()
- Adding and updating entries
- remove()
- Iterating using for loops and destructuring
- keys, values, size, isEmpty()
- getOrDefault()
- getOrElse()
- getOrPut()
*/

fun main() {

    // 1. Creating a read-only Map
    val products = mapOf(
        1 to "Laptop",
        2 to "Mouse",
        3 to "Keyboard"
    )

    // 2. Accessing values
    println("Product at key 2: ${products[2]}")
    println("Product at key 3: ${products.get(3)}")
    println("Missing product: ${products[4]}")

    // 3. Checking keys and values
    println("Key 1 exists: ${products.containsKey(1)}")
    println("Monitor exists: ${products.containsValue("Monitor")}")

    // 4. Creating a MutableMap
    val employees = mutableMapOf(
        101 to "Alex",
        102 to "Sarah",
        103 to "John"
    )

    // Adding entries
    employees[104] = "David"
    employees.put(105, "Emma")

    // Updating an existing entry
    employees[101] = "Michael"

    // Removing an entry
    employees.remove(102)

    println("Updated employees: $employees")

    // 5. Iterating using destructuring
    for ((id, name) in employees) {
        println("ID: $id, Name: $name")
    }

    // 6. Accessing keys and values separately
    println("Keys: ${employees.keys}")
    println("Values: ${employees.values}")

    // 7. Map properties
    println("Map size: ${employees.size}")
    println("Is map empty: ${employees.isEmpty()}")

    // 8. Safe retrieval using getOrDefault()
    println("Employee 101: ${employees.getOrDefault(101, "Unknown")}")
    println("Employee 999: ${employees.getOrDefault(999, "Unknown")}")

    // 9. Safe retrieval using getOrElse()
    println("Employee 104: ${employees.getOrElse(104) { "Not Found" }}")
    println("Employee 999: ${employees.getOrElse(999) { "Not Found" }}")

    // 10. Adding missing entries using getOrPut()
    val newEmployee = employees.getOrPut(106) {
        "Oliver"
    }

    println("New employee: $newEmployee")
    println("Final employees: $employees")
}