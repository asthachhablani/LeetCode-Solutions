// Problem: Valid Palindrome
// LeetCode: 125
// Approach: Use two pointers and ignore non-alphanumeric characters while comparing.
// Time Complexity: O(n)
// Space Complexity: O(n) (because of toLowerCase())

class Solution {
    public boolean isPalindrome(String s) {
        String st = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j && j >= 0 && i < s.length()) {
            if (!Character.isLetterOrDigit(st.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(st.charAt(j))) {
                j--;
                continue;
            }
            if (st.charAt(i) != st.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
