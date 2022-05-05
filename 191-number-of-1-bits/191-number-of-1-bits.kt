class Solution {
    // you need treat n as an unsigned value
    fun hammingWeight(n:Int):Int {
        var tmp = n
        var count = 0
        for (i in 0..31) {
            if(((tmp shr i) and 1) == 1) {
                count++
            }
        }
        return count
    }
}