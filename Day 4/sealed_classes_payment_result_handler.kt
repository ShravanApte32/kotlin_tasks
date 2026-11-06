/*
Question:

Create a sealed class named PaymentResult to represent different payment states.

Requirements:
1. Create the following subclasses:
   - Loading – singleton object.
   - Success – data class containing amount: Double.
   - Failed – data class containing reason: String.
   - Cancelled – singleton object.
2. Create a function handlePayment() that accepts a PaymentResult.
3. Use an exhaustive when expression to handle every possible payment state.
4. Print an appropriate message for each state.
5. Test all four states inside main().

Expected output:
Processing payment...
Payment successful: ₹1500.0
Payment failed: Insufficient balance
Payment cancelled.

*/
fun main() {
    handlePayment(PaymentResult.Loading)
    handlePayment(PaymentResult.Success(1500.0))
    handlePayment(PaymentResult.Failed("Insufficient balance"))
    handlePayment(PaymentResult.Cancelled)
}

sealed class PaymentResult {
    object Loading : PaymentResult()
    data class Success(val amount: Double) : PaymentResult()
    data class Failed(val reason: String) : PaymentResult()
    object Cancelled : PaymentResult()
}

fun handlePayment(result: PaymentResult) {
    when (result) {
        is PaymentResult.Loading ->
            println("Processing payment...")
        is PaymentResult.Success ->
            println("Payment successful: ₹${result.amount}")
        is PaymentResult.Failed ->
            println("Payment failed: ${result.reason}")
        is PaymentResult.Cancelled ->
            println("Payment cancelled.")
    }
}
