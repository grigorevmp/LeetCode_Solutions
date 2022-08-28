class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n <= 0) return false
        var number = n
        while (number >= 2) {
            if (number % 2 == 0) number /= 2
            else return false
        }        
        return true
    }
}