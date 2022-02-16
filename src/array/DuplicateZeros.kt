package array.practice

fun main() {
    val arr = intArrayOf(8,4,5,0,0,0,0,7)
    DuplicateZeros().duplicateZeros(arr)
}
class DuplicateZeros {
    //solution 1
    /*fun duplicateZeros(arr: IntArray): Unit {
        val zeroCounter = arr.filter { it == 0 }.size
        val newArr = IntArray(arr.size + zeroCounter)
        var currentIndex = 0
        for (i in 0 until arr.size) {
            if (arr[i] != 0) {
                newArr[currentIndex] = arr[i]
                currentIndex++
            } else {
                currentIndex+=2
            }
            arr[i] = newArr[i]
        }
        arr.forEach {
            print(it)
        }
    }*/

    //solution 2 (in-place)
    fun duplicateZeros(arr: IntArray): Unit {
        var i = 0
        var possibleDups = 0
        while (i in 0 until arr.size-possibleDups) {
            if (arr[i] == 0 && i != arr.size-possibleDups-1) {
                possibleDups++
            }
            i++
        }

        var lastIndex = arr.size-1
        for (i in arr.size-1-possibleDups downTo   0) {
            arr[lastIndex] = arr[i]
            if (arr[i] == 0) {
                lastIndex--
                arr[lastIndex] = arr[i]
            }
            lastIndex--
        }

        arr.forEach {
            print(it)
        }
    }
}