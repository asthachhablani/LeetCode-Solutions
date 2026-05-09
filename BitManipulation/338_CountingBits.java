// Problem: Counting Bits
// Link: https://leetcode.com/problems/counting-bits/
// Approach: Count set bits for every number using bitwise operations
// TC: O(n log n)

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for(int i = 0; i <= n; i++){
            int nums = i;
            int count = 0;

            while(nums > 0){
                count += (nums & 1);
                nums = nums >> 1;
            }

            ans[i] = count;
        }

        return ans;
    }
}
