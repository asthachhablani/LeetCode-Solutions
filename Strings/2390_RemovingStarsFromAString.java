// Problem: Removing Stars From a String
// LeetCode: 2390
// Approach: Use StringBuilder as a stack.
// Add normal characters and remove the last character whenever '*' is encountered.
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                sb.append(s.charAt(i));
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
