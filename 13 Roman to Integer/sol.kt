class Solution {
    fun romanToInt(s: String): Int {
        val map = mapOf('I' to 1,
                               'V' to 5,
                               'X' to 10,
                               'L' to 50,
                               'C' to 100,
                               'D' to 500,
                               'M' to 1000)
        var sum = 0
        var prev = 0
        for (ch in s.reversed()){
            if (ch in map)
            if (map.getValue(ch) >= prev){
                sum += map[ch]!!
            }
            else{
                sum -= map[ch]!!
            }
            prev = map[ch] !!
        }
        return sum
    }
}