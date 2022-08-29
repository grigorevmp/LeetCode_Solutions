class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n:Int):Int {
        val bits = IntArray(32)
        var index = 31
        var num = n
        var result = 0
        var multiplier = 1
            
        while (index > -1) { // store bits of given n
            bits[index--] = if (num and 1 == 0) 0 else 1 // checking last bit 0 or 1
            num = num shr 1 // shift right or divide by 2
        }
        
        for (i in 0 until 32) { // form result 
            result += bits[i] * multiplier
            multiplier *= 2
        }
        
        return result
    }
}