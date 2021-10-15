class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var counter = 0
        var result = ""
        for (i in 0..strs[0].length-1){
            var prev:Char? = null
            for (j in 0..strs.size-1){
                if (counter ==strs[j].length){
                    return result
                }
                else if(prev == null){
                    prev = strs[j][counter]
                }
                else if (strs[j][counter] != prev!!)
                    return result
            }
            result += strs[0][counter]
            counter += 1
        }
         return result
        }

    }
