class Solution {
    fun reverse(x: Int): Int {
        try{
            var xx = x
            var sign_ = 1
            if (x < 0) {
                sign_ = -1
                xx = sign_ * xx
            }
            
            var res = 0
            while (xx > 0) {
                
            if (res * sign_ > Integer.MAX_VALUE / 10 || res * sign_ < Integer.MIN_VALUE / 10) {
                return 0
              }
                   
              res = res * 10 + xx % 10
              xx = xx / 10
            }
               
            return (sign_ * res)


            }
        catch(e: Exception){
            return 0
        }
    }
}