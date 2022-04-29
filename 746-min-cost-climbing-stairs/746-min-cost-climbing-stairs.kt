class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val size_ = cost.size
        for (i in 2..size_-1) {
            cost[i] = Math.min(cost[i] + cost[i-1], cost[i] + cost[i-2])
        }
        return Math.min(cost[size_-1], cost[size_-2])
    }
}