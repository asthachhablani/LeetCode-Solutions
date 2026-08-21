// Problem: Remove Linked List Elements
// LeetCode: 203
// Approach: Remove all nodes whose value equals val by handling the head separately, then traversing the remaining list.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }

        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode temp = head;

        while(temp != null && temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
