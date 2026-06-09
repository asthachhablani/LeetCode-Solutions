// Problem: Power of Two
// Link: https://leetcode.com/problems/power-of-two/
// Approach: Recursively divide by 2
// TC: O(log n)

class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n == 1){
            return true;
        }

        if(n <= 0 || n % 2 != 0){
            return false;
        }

        return isPowerOfTwo(n / 2);
    }
}
