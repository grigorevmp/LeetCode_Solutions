class Solution {
    fun combinationSum3(k: Int, n: Int): List<List<Int>> {
        val result = mutableSetOf<List<Int>>()

        fun dfs(i: Int, current: List<Int>, sum: Int) {
            if (sum == n) {
                if (current.size == k){
                    result.add(current)
                }
            }

            for (j in i..9) {
                if (sum + j > n) {
                    break
                }

                dfs(j + 1, current + j, sum + j)
            }
        }

        dfs(1, emptyList(), 0)

        return result.toList()
    }
}