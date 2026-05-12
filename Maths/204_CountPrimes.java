// Problem: Count Primes
// Link: https://leetcode.com/problems/count-primes/
// Approach: Sieve of Eratosthenes
// TC: O(n log log n)

class Solution {
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n + 1];

        for(int i = 0; i < n; i++){
            primes[i] = true;
        }

        if(n > 0){
            primes[0] = false;
        }

        if(n > 1){
            primes[1] = false;
        }

        for(int i = 2; i * i < n; i++){
            if(primes[i]){
                for(int j = i * i; j < n; j += i){
                    primes[j] = false;
                }
            }
        }

        int count = 0;

        for(int i = 2; i < n; i++){
            if(primes[i]){
                count++;
            }
        }

        return count;
    }
}
