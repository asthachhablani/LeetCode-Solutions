// Problem: Single Number
// Link: https://leetcode.com/problems/single-number/
// Approach: XOR cancels duplicates
// TC: O(n), SC: O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int single = 0;

        for(int i = 0; i < nums.length; i++){
            single = single ^ nums[i];
        }

        return single;
    }
}
