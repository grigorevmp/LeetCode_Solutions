class Solution {
    fun climbStairs(n: Int): Int {
     var dp = IntArray(55, {0})
        dp[1] = 1
        dp[2] = 2

        (3 .. n).forEach { i ->
            dp[i] = dp[i-1]+dp[i-2]
        }
        return dp[n]
        
    }
}