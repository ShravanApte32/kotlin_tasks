/*
Question:

- Create a higher-order function called calculateDiscount.
- Accept a product price (Double).
- Accept a discount function of type (Double) -> Double.
- Execute the discount function using the supplied price.
- Return the final discounted price.
- Apply a 10% discount using one lambda.
- Apply a 20% discount using another lambda.
*/

fun main() {
    val first_lamda = calculateDiscount(1000.0) { price ->
        val disc = price * 0.10
        price - disc
    }

    val second_lamda = calculateDiscount(1000.0) { price ->
        val disc = price * 0.20
        price - disc
    }

    println(first_lamda)
    println(second_lamda)
}

fun calculateDiscount(
    price: Double,
    discount: (Double) -> Double
): Double {
    return discount(price)
}