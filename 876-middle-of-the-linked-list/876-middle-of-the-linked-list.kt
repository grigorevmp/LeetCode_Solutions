class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var pointer = 0
        var curr = head
        while (curr != null){
            curr = curr.next
            pointer += 1
        }
        val center = pointer/ 2
        curr = head
        pointer = 0
        while (pointer != center){
            curr = curr!!.next
            pointer += 1
        }
        return curr
    }
}