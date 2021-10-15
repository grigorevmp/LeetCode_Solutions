class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var min = -1
        var max = nums.size
        var i=(min+max)/2
        do{
            if(nums[i] == target){
                return i
            }
            else if(nums[i] < target){
                min = i
            }
            else{
                max = i
            }
            i=(min+max)/2
        }while((i!=min) and (i != max))
        return -1
    }
}