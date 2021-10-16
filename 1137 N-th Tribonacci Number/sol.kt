class Solution {
    fun tribonacci(n: Int): Int {
        val ret: MutableList<Int> = arrayListOf(0, 1, 1);
        if (n == 0)
            return 0
        if (n == 1)
            return 1
        if (n == 2)
            return 1

        for(i in 3..n+1)
            ret.add(ret[i-1] + ret[i-2] + ret[i-3])
        return ret[n]

    }
}