class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1
        while (i <= j){
            var sum = numbers[i] + numbers[j]
            if(sum > target)
                j--
            else if(sum < target)
                i++
            else
                return intArrayOf(i+1, j+1)
        }
         return intArrayOf(i+1, j+1)

    }
}


