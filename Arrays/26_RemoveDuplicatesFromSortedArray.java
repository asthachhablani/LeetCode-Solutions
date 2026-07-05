// Problem: Remove Duplicates from Sorted Array
// LeetCode: 26
// Approach: Use two pointers to overwrite duplicate elements in-place.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
