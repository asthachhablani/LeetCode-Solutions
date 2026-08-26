// Problem: Remove Nth Node From End of List
// LeetCode: 19
// Approach: Count the length of the list, then remove the required node using its position from the beginning.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        int diff = count - n;

        if(n == count){
            head = head.next;
            return head;
        }

        temp = head;

        for(int i = 0; i < diff - 1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}
