// Problem: Sort an Array
// LeetCode: 912
// Approach: Use Merge Sort (Divide and Conquer) to recursively split the array,
// sort both halves, and merge them back in sorted order.
// Time Complexity: O(n log n)
// Space Complexity: O(n)

class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newNums = new int[first.length + second.length];

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                newNums[k] = first[i];
                i++;
            } else {
                newNums[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            newNums[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            newNums[k] = second[j];
            j++;
            k++;
        }

        return newNums;
    }
}
