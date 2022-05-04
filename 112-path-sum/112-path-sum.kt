/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean{        
        return calculateAndCheckSum(root, 0, targetSum)
    }
    
    fun calculateAndCheckSum(root: TreeNode?, sum: Int, targetSum: Int): Boolean {
        if (root == null) return false
        
        var sum1 = sum + root.`val`
        
        if ((root.left == null) && (root.right == null)) {
            if (sum1 == targetSum) return true
        }
        return calculateAndCheckSum(root.left, sum1, targetSum) || calculateAndCheckSum(root.right, sum1, targetSum)
    }
}