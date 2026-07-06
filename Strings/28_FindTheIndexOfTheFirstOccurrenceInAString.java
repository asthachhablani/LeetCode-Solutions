// Problem: Find the Index of the First Occurrence in a String
// LeetCode: 28
// Approach: Use built-in string methods contains() and indexOf().
// Time Complexity: O(n × m)
// Space Complexity: O(1)

class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }

        return -1;
    }
}
