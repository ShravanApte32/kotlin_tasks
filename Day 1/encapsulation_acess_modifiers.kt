// Question: Create a BankAccount class with a private balance. Implement deposit, withdrawal, and balance display methods. Validate transaction amounts, prevent insufficient withdrawals, reject non-finite values, and return Boolean transaction results.

fun main() {
    val account1 = BankAccount()

    val trans1 = account1.deposit(20000.0)
    val trans2 = account1.withdraw(50000.0)
}

class BankAccount {
    private var balance: Double = 50000.0

    fun deposit(amount: Double): Boolean {
        if (!amount.isFinite()) {
            println("NaN, positive infinity, and negative infinity values not allowed")
            return false
        } else if (amount <= 0) {
            println("The deposit amount cannot be 0 or less than 0")
            return false
        } else {
            println("Your current balance is $balance before the transaction")
            balance += amount
            println("$amount has been deposited")
            println("Your current balance is $balance after the transaction")
            println("")
            return true
        }
    }

    fun withdraw(amount: Double): Boolean {
        if (!amount.isFinite()) {
            println("NaN, positive infinity, and negative infinity values not allowed")
            return false
        } else if (amount <= 0) {
            println("The withdrawal amount cannot be 0 or less than 0")
            return false
        } else if (balance >= amount) {
            println("Your current balance is $balance before the transaction")
            balance -= amount
            println("$amount has been withdrawn")
            println("Your current balance is $balance after the transaction")
            println("")
            return true
        } else {
            println("Withdrawal of $amount has failed since your current balance is $balance")
            println("")
            return false
        }
    }

    fun showBalance() {
        println("Your current balance is $balance")
        println("")
    }
}