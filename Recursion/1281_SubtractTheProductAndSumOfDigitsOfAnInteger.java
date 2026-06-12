// Problem: Subtract the Product and Sum of Digits of an Integer
// Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// Approach: Recursion for product and sum of digits
// TC: O(log n)

class Solution {
    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }

    static int product(int n){
        if(n % 10 == n){
            return n;
        }

        return (n % 10) * product(n / 10);
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return (n % 10) + sum(n / 10);
    }
}
