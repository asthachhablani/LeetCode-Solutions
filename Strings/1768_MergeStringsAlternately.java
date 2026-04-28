// Problem: Merge Strings Alternately
// Link: https://leetcode.com/problems/merge-strings-alternately/
// Approach: Traverse both strings and append characters alternatively
// TC: O(n + m)

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < Math.min(n, m); i++){
            newStr.append(word1.charAt(i));
            newStr.append(word2.charAt(i));
        }

        for(int i = Math.min(n, m); i < m; i++){
            newStr.append(word2.charAt(i));
        }

        for(int i = Math.min(n, m); i < n; i++){
            newStr.append(word1.charAt(i));
        }

        return newStr.toString();
    }
}
