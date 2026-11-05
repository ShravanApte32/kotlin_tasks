/*
Question:

Create an OrderStatus enum containing:
- PLACED
- PROCESSING
- SHIPPED
- DELIVERED
- CANCELLED

Demonstrate:
- Enum constants.
- Custom properties using enum constructors.
- Accessing enum properties.
- Using name and ordinal.
- Functions inside enum classes.
- Using this to refer to the current enum constant.
- Logical conditions with ||.
- Create two order statuses (SHIPPED and DELIVERED) and print their messages and completion status.
*/

enum class OrderStatus(val message: String) {
    PLACED("Order placed"),
    PROCESSING("Processing order"),
    SHIPPED("Order shipped"),
    DELIVERED("Order delivered"),
    CANCELLED("Order cancelled");

    fun isCompleted(): Boolean {
        return this == DELIVERED || this == CANCELLED
    }
}

fun main() {
    val order1 = OrderStatus.SHIPPED
    val order2 = OrderStatus.DELIVERED

    println(order1.message)
    println(order1.isCompleted())
    println(order2.message)
    println(order2.isCompleted())
}