// Problem: Check if Array Is Sorted and Rotated
// LeetCode: 1752
// Approach: Count the number of places where order breaks
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
