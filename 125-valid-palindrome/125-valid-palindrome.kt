class Solution {
    fun isPalindrome(s: String): Boolean {
        var s2 = ""
        var s3 = ""
        for (ch in s){
            if((('a' <= ch) and (ch <= 'z')) or(('0' <= ch) and (ch <= '9'))){
                s2 += ch
                s3 = ch + s3
            }
            else if (('A' <= ch) and (ch<= 'Z')){
                s2 += ch.toLowerCase()
                s3 = ch.toLowerCase() + s3
            }
        }
        return s2 == s3
    }
}