class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var start = 0
        for (i in 0..nums.size-1)
            if(nums[i] != 0){
                nums[start++] = nums[i] 
            }

        for(i in start..nums.size-1)
            nums[i]=0;
    }
}