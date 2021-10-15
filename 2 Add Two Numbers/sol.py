# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        l1_s = []
        l2_s = []
        while l1 != None:
            l1_s.append(l1.val)
            l1 = l1.next
        while l2 != None:
            l2_s.append(l2.val)
            l2 = l2.next
        l1_int = int((''.join(str(e) for e in l1_s))[::-1])
        l2_int = int((''.join(str(e) for e in l2_s))[::-1])
        summ = str(l1_int + l2_int)

        list = ListNode(int(summ[0]))
        list_list = []
        list_list.append(list)

        for ch in summ[1:]:
            list1 = ListNode(int(ch), list_list[-1])
            list_list.append(list1)

        return (list_list[-1])