import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var s = 0
        var e = height.size - 1
        var max = 0
        
        while (s != e){
            if( (min(height[e], height[s]) * (e - s)) > max){
                max = (min(height[e], height[s]) * (e - s))
            }
            if(height[e] > height[s]){
                s += 1
            }else{
                e -= 1
            }
        }
        
        return max
    }
}