// Problem: Number of 1 Bits
// Link: https://leetcode.com/problems/number-of-1-bits/
// Approach: Check last bit using AND and right shift
// TC: O(log n)

class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while(n > 0){
            if((n & 1) == 1){
                count++;
            }

            n = n >> 1;
        }

        return count;
    }
}
