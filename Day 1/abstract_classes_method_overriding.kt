/*
Question: Create an abstract class Payment containing balance and amount properties. Declare an abstract method processPayment() and a normal method displayAmount().

Create two child classes:
- CreditCardPayment
- UPIPayment
Both should inherit from Payment, implement processPayment(), deduct the payment amount from their respective balances, and display the updated balance.
*/

fun main() {
    val credit = CreditCardPayment(50000.0, 5000.0)
    val upi = UPIPayment(10000.0, 2000.0)

    credit.processPayment()
    upi.processPayment()
}

abstract class Payment(
    var balance: Double,
    var amount: Double
) {
    abstract fun processPayment()

    fun displayAmount() {
        println("The payment amount is $amount")
    }
}

class CreditCardPayment(
    balance: Double,
    amount: Double
) : Payment(balance, amount) {

    override fun processPayment() {
        balance = balance - amount
        println("Payment processed successfully using Credit Card")
        println("Updated Balance: $balance")
    }
}

class UPIPayment(
    balance: Double,
    amount: Double
) : Payment(balance, amount) {

    override fun processPayment() {
        balance = balance - amount
        println("Payment processed successfully using UPI")
        println("Updated Balance: $balance")
    }
}