class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val nums_copy = nums.toMutableList()
        var k_ = k % nums.size

            for (j in 0..nums.size-1){
                if (k_ == 0){
                    k_ = nums.size
                }
                nums[j] = nums_copy[nums.size - k_]
                k_ -= 1
            }

    }
}