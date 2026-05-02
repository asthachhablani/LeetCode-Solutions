// Problem: Find the Highest Altitude
// Link: https://leetcode.com/problems/find-the-highest-altitude/
// Approach: Running sum + track max
// TC: O(n)

class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++){
            altitude += gain[i];
            if(altitude > max){
                max = altitude;
            }
        }

        return max;
    }
}
