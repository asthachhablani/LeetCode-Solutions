// Problem: Find Target Indices After Sorting Array
// LeetCode: 2089
// Approach: Sort the array and collect all indices where target is present
// Time Complexity: O(n log n)
// Space Complexity: O(1) excluding output list

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                list.add(i);
            }
        }

        return list;
    }
}
