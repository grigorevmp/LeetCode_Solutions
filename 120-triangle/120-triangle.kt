class Solution {
    fun minimumTotal(triangle: List<List<Int>>): Int {
        var maxR = triangle.lastIndex
        var sums = mutableListOf<Int>()
        sums.add(triangle[0][0])
        for (r in 1..maxR) {
            val row = triangle[r]
            val newSums = mutableListOf<Int>()
            newSums.add(row[0] + sums[0])
            for (i in 1 until row.lastIndex) {
                newSums.add(row[i] + minOf(sums[i-1], sums[i]))
            }
            newSums.add(row[row.lastIndex] + sums[sums.lastIndex])
            sums = newSums
        }
        return sums.min()!!
    }
}