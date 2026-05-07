// Problem: Single Number II
// Link: https://leetcode.com/problems/single-number-ii/
// Approach: Sort array and check every 3 elements
// TC: O(n log n)

import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i += 3){
            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}
