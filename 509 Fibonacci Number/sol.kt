class Solution {
    fun fib(n: Int): Int {
        return when (n) {
            0, 1 -> n
            else -> fib(n - 1) + fib(n - 2)
        }
    }
}