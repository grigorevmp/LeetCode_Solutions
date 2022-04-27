class Solution {
    fun lengthOfLastWord(s: String): Int {
        var localLen = 0
        for (i in (s.length-1) downTo 0){
            if(s[i] == ' '){
                if(localLen != 0){
                    return localLen
                }
            }
            else{
                localLen += 1
            }
        }
        return localLen 
    }
}