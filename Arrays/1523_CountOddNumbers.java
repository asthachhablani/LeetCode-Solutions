// Problem: Count Odd Numbers in an Interval Range
// Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// Approach: Math + bit check
// TC: O(1)

class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;

        if((low & 1) == 1 || (high & 1) == 1){
            count++;
        }

        return count;
    }
}
