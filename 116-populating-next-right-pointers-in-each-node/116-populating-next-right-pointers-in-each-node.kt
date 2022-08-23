/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var left: Node? = null
 *     var right: Node? = null
 *     var next: Node? = null
 * }
 */

class Solution {
    fun connect(root: Node?): Node? {
        var start = root
        while (start != null) {
            var curr = start
            while (curr != null) {
                curr.left?.let { it.next = curr?.right }
                curr.right?.let { it.next = curr?.next?.left }
                curr = curr.next
            }
            start = start.left
        }
        return root
    }
}