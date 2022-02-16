package array

fun main() {
    val nums = intArrayOf(1,2,3,4,5,6,7)
    val k = 3
    rotate(nums, k)
}

fun rotate(nums: IntArray, k: Int): Unit {
    val tempArray = nums.slice(nums.size-k.rem(nums.size) until nums.size)
    for (i in 0 until nums.size-k.rem(nums.size)) {
        nums[i + k.rem(nums.size)] = nums[i]
    }
    for (i in 0 until k.rem(nums.size)) {
        nums[i] = tempArray[i]
    }

    nums.forEach {
        print(it)
    }
    //posisi baru = posisi sekarang + k modulus in
    //jika posisi baru > size array, maka posisi baru = posisi baru - size array
}
