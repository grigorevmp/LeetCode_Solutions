class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
    if (divisor == 0) return Int.MAX_VALUE

    if (dividend == Int.MIN_VALUE) {
        if (divisor == -1) return Int.MAX_VALUE
        else if (divisor == 1) return Int.MIN_VALUE
    }

    var dividend_long = dividend.toLong()
    var divisor_long = divisor.toLong()
    
    var sign = 1

    if (dividend_long < 0) {
        dividend_long = -dividend_long
        sign = -sign
    }

    if (divisor_long < 0) {
        divisor_long = -divisor_long
        sign = -sign
    }

    var res = 0L

    while (dividend_long >= divisor_long){
        var sum = divisor_long
        var pow = 1L

        while (sum + sum <= dividend_long) {
            sum += sum
            pow += pow
        }

        dividend_long -= sum
        res += pow
    }

    return sign * res.toInt()
        
    }  
}