// Problem: Majority Element
// LeetCode: 169
// Approach: Brute Force - Count the frequency of every element
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public int majorityElement(int[] nums) {

        for(int i = 0; i < nums.length; i++) {
            int count = 0;

            for(int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }

            if(count > nums.length / 2) {
                return nums[i];
            }
        }

        return -1;
    }
}
