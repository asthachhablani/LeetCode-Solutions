// Problem: Maximum Number of Coins You Can Get
// LeetCode: 1561
// Approach: Sort the array, then use two pointers to greedily pick the second largest pile in each group.
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);

        int i = 0;
        int j = piles.length - 1;
        int ans = 0;

        while (i < j) {
            ans += piles[j - 1];
            i++;
            j -= 2;
        }

        return ans;
    }
}
