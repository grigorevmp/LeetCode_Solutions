class Solution {
    fun reverse(x: Int): Int {
        try{
            var sign_ = 1
            if (x < 0){
                sign_ *= -1
            }
            var str = Math.abs(x).toString().removePrefix ("0")
            str = str.reversed()
            if (str != ""){
                return sign_ * str.toInt()
            }
            else 
                return x
            }
        catch(e: Exception){
            return 0
        }
    }
}