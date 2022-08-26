class Solution {
 fun permute(nums: IntArray): List<List<Int>> {
        var ans = ArrayList<ArrayList<Int>>()
        
        fun track(level: ArrayList<Int>){
            if(level.size == nums.size){
                var temp = level.toSet()
                if(temp.size == nums.size)
                    ans.add(ArrayList(level))
                    
                return 
            }
            
            for(i in nums){
                level.add(i)
                track(level)
                level.removeAt(level.size-1)
            }
        }
    
        track(ArrayList<Int>())
        
        return ans.toList()
    }
}