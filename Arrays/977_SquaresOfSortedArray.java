// Problem: Squares of a Sorted Array
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Approach: Square each element and sort the array
// TC: O(n log n)

class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }
}
