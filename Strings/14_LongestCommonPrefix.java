// Problem: Longest Common Prefix
// LeetCode: 14
// Approach: Compare characters of the first string with all other strings character by character.
// Time Complexity: O(n × m)
// Space Complexity: O(1) (excluding the output string)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return s;
                }
            }
            s += strs[0].charAt(i);
        }

        return s;
    }
}
