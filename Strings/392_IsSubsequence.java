// Problem: Is Subsequence
// LeetCode: 392
// Approach: Use two pointers to compare characters of both strings.
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
