class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var p1 = m-1
        var p2 = n-1
        for (i in (m + n -1) downTo 0) {
            if (p2 < 0) break
            when {
                p1 >= 0 && nums1[p1] > nums2[p2] -> nums1[i] = nums1[p1--] 
                else -> nums1[i] = nums2[p2--]
            }
        }
    }
}