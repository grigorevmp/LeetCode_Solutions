class Solution {
    fun reverseString(s: CharArray): Unit {
        var start = 0
        var end = s.size-1
        for (char in 0..(s.size-1)/2){
            val tmp = s[end]
            s[end--] = s[start]
            s[start++] = tmp
        }
    }
}