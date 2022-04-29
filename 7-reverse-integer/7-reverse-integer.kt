class Solution {
    fun reverse(x: Int): Int {
        try{
            var sign_ =
            if (x < 0){
                -1
            } else 1
            var x_c = Math.abs(x)
            
            var str = ""
            while (x_c != 0){
                val ch = x_c % 10
                if (((str == "") and (ch != 0)) or (str != "")){
                    str += ch
                }
                x_c /= 10
            }
            
            return sign_ * str.toInt()
            

            }
        catch(e: Exception){
            return 0
        }
    }
}