class Solution {
    private val result = mutableListOf<String>()
    
    fun generateParenthesis(n: Int): List<String> {
        generateParenthesisRec("", n, n)
        return result
    }
    
    private fun generateParenthesisRec(text: String, left: Int, right: Int) {
        if (left > 0) {
            generateParenthesisRec(text+"(", left-1, right)
        }
            
        if (right > 0 && right > left) {
            generateParenthesisRec(text + ")", left, right-1)
        } else if (left + right == 0) {
            result.add(text)
        }
    }
}



// (  -- 