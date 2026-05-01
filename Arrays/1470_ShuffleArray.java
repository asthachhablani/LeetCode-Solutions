// Problem: Shuffle the Array
// Link: https://leetcode.com/problems/shuffle-the-array/
// Approach: 2 pointers (i and i+n)
// TC: O(n)

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[2*n];
        for(int i = 0; i<n;i++){
            newArr[2*i] = nums[i];
            newArr[2*i+1] = nums[i+n];
        }
        return newArr;
    }
}
