// Problem: Find Smallest Letter Greater Than Target
// Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Approach: Binary Search with wrap around
// TC: O(log n)

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(target >= letters[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }
}
