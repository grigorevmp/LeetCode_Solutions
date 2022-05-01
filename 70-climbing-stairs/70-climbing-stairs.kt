class Solution {
    fun climbStairs(n: Int): Int {
        var first = 1
        var second = 1
        repeat(n - 1) {
            first += second.apply { second = first }
        }
        return first
    }
}