class Solution {
    fun reverse(x: Int): Int {
        try{
            var x_c = Math.abs(x)
            
            var str = if (x < 0){
                "-"
            } else ""
            
            while (x_c != 0){
                val ch = x_c % 10
                if (((str == "") and (ch != 0)) or (str != "")){
                    str += ch
                }
                x_c /= 10
            }
            
            return str.toInt()
            

            }
        catch(e: Exception){
            return 0
        }
    }
}