/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var sum = 0
        var curr = head
        while (curr != null){
            curr = curr.next
            sum += 1
        }
        var numToDelete = sum - n
        var pointer = 0
        curr = head
        while (curr != null){
            if (pointer == numToDelete) {
                return curr.next
            }
            if (pointer == numToDelete - 1) {
                if (curr.next != null) {
                    curr.next = (curr.next).next
                }
                else {
                    curr.next = null
                }
                break
            }
            curr = curr.next
            pointer += 1
        }
        return head
    }
    
}