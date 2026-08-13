// Problem: Middle of the Linked List
// LeetCode: 876
// Approach: Use Slow and Fast Pointer.
// Slow moves one step while Fast moves two steps.
// When Fast reaches the end, Slow will be at the middle.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
