// Problem: Length of Last Word
// LeetCode: 58
// Approach: Remove trailing spaces, find the last space, and return the length of the last word
// Time Complexity: O(n)
// Space Complexity: O(n) (substring creates a new string)

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int index = s.lastIndexOf(" ");
        String str = s.substring(index + 1);

        return str.length();
    }
}
