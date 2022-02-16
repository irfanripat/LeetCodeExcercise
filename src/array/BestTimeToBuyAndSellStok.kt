package array

fun main() {
    val prices = intArrayOf(1, 2, 3, 4, 5)
    print(maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var i = 1
    while (i < prices.size) {
        if (prices[i] - prices[i - 1] > 0) {
            profit += (prices[i] - prices[i - 1])
        }
        i++
    }
    return profit
}