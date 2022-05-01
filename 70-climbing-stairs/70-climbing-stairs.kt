class Solution {
    fun climbStairs(n: Int): Int {
                if (n == 1)
            return 1
        val res: MutableList<Int> = arrayListOf(1, 1, 2)


        for(i in 3..n){
            res.add(res[i-1] + res[i-2])

        }
        return res[n]
    }
}