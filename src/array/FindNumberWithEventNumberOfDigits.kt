package array.practice

fun main() {
    val nums = intArrayOf(555,901,482,1771)
    print(FindNumberWithEventNumberOfDigits().findNumbers(nums))
}
class FindNumberWithEventNumberOfDigits {
    fun findNumbers(nums: IntArray): Int {
        var n = 0
        for (num in nums) {
            if (num.toString().length % 2 == 0) {
                n++
            }
        }
        return n
    }

    fun findNumbers2(nums: IntArray) : Int = nums.filter { it.toString().length.rem(2) == 0 }.size

    fun countDigit(num: Int) : Int {
        var digit = 0
        var num = num
        while (num < 0) {
            num = 3
        }
        return digit
    }
}