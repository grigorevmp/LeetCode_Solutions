class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var minSum = nums[0]
        var maxSum = nums[0]
        var tempSum = 0
        
        for (num in nums){
            if(num > tempSum + num){
                tempSum = num
            }
            else if(tempSum + num < minSum){
                if((minSum < 0) and (tempSum + num > minSum)){
                    minSum = tempSum + num
                }
                else if((minSum > 0) and (tempSum + num < minSum)){
                    minSum = tempSum + num
                }
                tempSum = minSum
            }
            else{
                tempSum += num
            }
            
            if(tempSum > maxSum){
                maxSum = tempSum
            }
        }
        return maxSum
    }
}