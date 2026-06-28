// Problem: Third Maximum Number
// LeetCode: 414
// Approach: Keep track of the first, second, and third distinct maximum values
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {

            // Ignore duplicate values
            if(nums[i] == first || nums[i] == second || nums[i] == third) {
                continue;
            }

            if(nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] > second) {
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third) {
                third = nums[i];
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }
}
