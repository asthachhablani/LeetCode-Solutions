// Problem: First Bad Version
// LeetCode: 278
// Approach: Binary Search on Answer
// Time Complexity: O(log n)
// Space Complexity: O(1)

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version);
*/

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(isBadVersion(mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
