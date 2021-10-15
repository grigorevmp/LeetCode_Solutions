class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var nums_new = mutableListOf<Int>()
        for (num in nums){
            nums_new.add(num*num)
        }
        return nums_new.sorted().toIntArray()
    }
}