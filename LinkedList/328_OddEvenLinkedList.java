// Problem: Odd Even Linked List
// LeetCode: 328
// Approach: Separate odd and even positioned nodes, then connect the odd list with the even list.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
}
