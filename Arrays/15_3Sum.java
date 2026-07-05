// Problem: 3Sum
// LeetCode: 15
// Approach: Sort the array, fix one element, then use two pointers to find the remaining two elements whose sum is zero.
// Time Complexity: O(n²)
// Space Complexity: O(1) (excluding the output list)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> total = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = n - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    total.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return total;
    }
}
