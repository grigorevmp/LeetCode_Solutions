class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (num in nums){
            if ((target - num) in nums){
                if (target == 2*num) {
                    if (nums.count { it == num } > 1){
                        return intArrayOf(nums.indexOf(num), nums.lastIndexOf(target - num))
                    }
                    else
                        continue
                }
                else
                    return intArrayOf(nums.indexOf(num), nums.indexOf(target - num))
            }
        }
        return intArrayOf()
    }
}