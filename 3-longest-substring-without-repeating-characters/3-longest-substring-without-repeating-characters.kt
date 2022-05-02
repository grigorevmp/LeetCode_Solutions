class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val starts = hashMapOf<Char, Int>()
        var max = 0
        var currentStart = 0

        for ((index, c) in s.withIndex()) {
            val breakIndex = starts.put(c, index)

            if (breakIndex != null && breakIndex >= currentStart) {
                currentStart = breakIndex + 1
            }

            max = max.coerceAtLeast(index - currentStart + 1)
        }

        return max
    }
}