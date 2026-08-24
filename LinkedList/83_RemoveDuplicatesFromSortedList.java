// Problem: Remove Duplicates from Sorted List
// LeetCode: 83
// Approach: Traverse the sorted linked list and skip duplicate nodes.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while(temp != null && temp.next != null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
