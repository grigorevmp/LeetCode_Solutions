class Solution {
 fun combine(n: Int, k: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()

        fun dfs(currentCombination: List<Int>, startIndex: Int) {
            if(currentCombination.size == k) {
                result += currentCombination
                return
            }
            for(i in startIndex..n) {
                if(currentCombination.contains(i)) {
                    continue;
                }
                val newCombination = currentCombination.toMutableList()
                newCombination += i
                dfs(newCombination, i + 1)
            }
        }

        dfs(mutableListOf(), 1)
        return result
    }
}