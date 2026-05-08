// Problem: Build Array from Permutation
// Link: https://leetcode.com/problems/build-array-from-permutation/
// Approach: Use nums[nums[i]] to build answer array
// TC: O(n)

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
