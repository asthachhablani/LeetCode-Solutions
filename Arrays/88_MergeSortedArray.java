// Problem: Merge Sorted Array
// LeetCode: 88
// Approach: Merge both sorted arrays into a temporary array, then copy the result back to nums1.
// Time Complexity: O(m + n)
// Space Complexity: O(m + n)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newArr = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                newArr[k] = nums1[i];
                i++;
            } else {
                newArr[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            newArr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            newArr[k] = nums2[j];
            j++;
            k++;
        }

        for (int l = 0; l < m + n; l++) {
            nums1[l] = newArr[l];
        }
    }
}
