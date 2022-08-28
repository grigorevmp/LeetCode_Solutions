class Solution {
   fun rob(nums: IntArray): Int {
    if(nums.size == 2) return maxOf(nums[0] , nums[1])
    if(nums.isEmpty()) return 0
    if(nums.size == 1) return nums[0]
    
    var prevDouble = nums[0]
    var prevOne = maxOf(nums[0] , nums[1])
    var result = 0
    for(i in 2..nums.size - 1){
    result = maxOf(prevOne , nums[i] + prevDouble)
    prevDouble = prevOne
    prevOne = maxOf(prevOne , result)
    }
    
    return result
}
}