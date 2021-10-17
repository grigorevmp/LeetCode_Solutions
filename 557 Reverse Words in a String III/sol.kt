class Solution {
    fun reverseWords(s: String): String {
        var index = 0
        var start = 0
        var s2 = s.toCharArray() + charArrayOf(' ')
        while (index != s2.size-1){
            if ((index == s2.size-1) or (s2[index+1] == ' ')){
                var end = index
                for (char in 0..(end-start)/2){
                    val tmp = s2[end]
                    s2[end--] = s2[start]
                    s2[start++] = tmp
                }
                start = index
            }
            else if(s2[index] == ' ')
                start = index + 1
            index++
        }
        return String(s2).dropLast(1)
    }
}