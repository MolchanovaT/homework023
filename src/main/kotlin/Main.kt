fun main() {
    val sumLast = 5_000
    val discountFirstStart = 1_000
    val discountSecondStart = 10_000
    val firstDiscount = 100
    val secondDiscountPercentage = 5
    val regularDiscountPercentage = 1
    val regularCustomer = true
    val sum = 3_000

    var totalPrice: Int
    if (sumLast <= discountFirstStart) {
        totalPrice = sum
    } else if (sumLast in ((discountFirstStart + 1) until (discountSecondStart + 1))) {
        totalPrice = sum - firstDiscount
        if (regularCustomer) {
            totalPrice -= totalPrice * regularDiscountPercentage / 100
        }
    } else {
        totalPrice = sum - sum * secondDiscountPercentage / 100
        if (regularCustomer) {
            totalPrice -= totalPrice * regularDiscountPercentage / 100
        }
    }
    println("Total price: $totalPrice")
}