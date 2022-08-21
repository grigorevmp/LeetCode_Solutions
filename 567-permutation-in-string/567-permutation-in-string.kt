class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
    val arr1 = IntArray(26){0}
	val arr2 = IntArray(26){0}
    
	var start = 0
        
	for(c in s1) arr1[c - 'a']++
        
	for(end in s2.indices) {
		arr2[s2[end] - 'a']++
        
		if(end - start + 1 > s1.length) arr2[s2[start++] - 'a']--
        
		if(arr1 contentEquals arr2) return true
	}
	return false
    }
}