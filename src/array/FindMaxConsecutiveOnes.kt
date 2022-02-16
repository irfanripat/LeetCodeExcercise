package array.practice


fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1)
    print(FindMaxConsecutiveOnes().findMaxConsecutiveOnes(nums))
}

class FindMaxConsecutiveOnes {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var m = 0
        var j = 0
        for (i in nums.indices) {
            if (nums[i] == 1) {
                j++
            } else {
                j = 0
            }
            m = Integer.max(j, m)
        }
        return m
    }
}