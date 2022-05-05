class Solution {
    fun mySqrt(x: Int): Int {
        if (x < 2) return x
        val X = x.toLong()
        var left = 2
        var right = x / 2
        while (left <= right) {
            val mid = left + (right - left) / 2
            val ans = 1L * mid * mid
            if (ans < X) {
                left = mid + 1
            } else if (ans > X) {
                right = mid - 1
            } else return mid
        }
        return left - 1
    }
}