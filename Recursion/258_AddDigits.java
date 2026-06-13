// Problem: Add Digits
// Link: https://leetcode.com/problems/add-digits/
// Approach: Recursively find sum of digits until single digit remains
// TC: O((log n)²) in worst case

class Solution {
    public int addDigits(int num) {
        if(num < 10){
            return num;
        }

        return addDigits(sum(num));
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return n % 10 + sum(n / 10);
    }
}
