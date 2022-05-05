class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
    if (divisor == 0) return Int.MAX_VALUE

    if (dividend == Int.MIN_VALUE) {
        if (divisor == -1) return Int.MAX_VALUE
        else if (divisor == 1) return Int.MIN_VALUE
    }

    var a = dividend.toLong()
    var b = divisor.toLong()
    var sign = 1

    if (a < 0) {
        a = -a
        sign = -sign
    }

    if (b < 0) {
        b = -b
        sign = -sign
    }

    var res = 0L

    while (a >= b){
        var sum = b
        var pow = 1L

        while (sum + sum <= a) {
            sum += sum
            pow += pow
        }

        a -= sum
        res += pow
    }

    return sign * res.toInt()
        
    }  
}