// Problem: Subsets
// LeetCode: 78
// Approach: Use Backtracking (Recursion) to generate all possible subsets.
// At each index, either include the current element or exclude it.
// Time Complexity: O(n * 2^n)
// Space Complexity: O(n) (Recursion stack, excluding output)

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(nums, 0, ans, output);

        return ans;
    }

    static void solve(int[] nums, int index, List<List<Integer>> ans,
                      List<Integer> output) {

        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        output.add(nums[index]);
        solve(nums, index + 1, ans, output);

        output.remove(output.size() - 1);
        solve(nums, index + 1, ans, output);
    }
}
