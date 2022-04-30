class Solution {
    
    fun returnParenthesis(str: String, o: Int, max: Int): List<String> {
        if (o > 0){
          if(max > 0){
               return returnParenthesis(str+"(", o+1, max-1) + returnParenthesis(str+")", o-1, max)
          } else {
              return returnParenthesis(str+")", o-1, 0)
          }
        } else{
          if(max > 0){
              return returnParenthesis(str+"(", 1, max-1)
          } else {
              return arrayListOf(str)
          }
        }
    }
    
    fun generateParenthesis(n: Int): List<String> {
        return returnParenthesis("", 0, n)
    }
}



// (  -- 