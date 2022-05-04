class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) { return true }

        val filtered = StringBuilder()
        for (i in s.indices) {
            if (Character.isLetterOrDigit(s[i])) { filtered.append(s[i]) }
        }

        return filtered.reversed().toString().equals(filtered.toString(), ignoreCase = true) 
    }
}