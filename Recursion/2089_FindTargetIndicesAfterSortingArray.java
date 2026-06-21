// Problem: Find Target Indices After Sorting Array
// LeetCode: 2089
// Approach: Sort the array and use recursion to collect all target indices
// Time Complexity: O(n log n) + O(n) = O(n log n)
// Space Complexity: O(n) (recursion stack + output list)

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        return findIndex(nums, target, 0, list);
    }

    static List<Integer> findIndex(int[] nums, int target, int index, List<Integer> list) {
        if(index == nums.length) {
            return list;
        }

        if(nums[index] == target) {
            list.add(index);
        }

        return findIndex(nums, target, index + 1, list);
    }
}
