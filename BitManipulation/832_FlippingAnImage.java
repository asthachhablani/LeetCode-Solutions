// Problem: Flipping an Image
// Link: https://leetcode.com/problems/flipping-an-image/
// Approach: Reverse + invert simultaneously using XOR
// TC: O(n^2)

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < (image[i].length + 1) / 2; j++){

                int temp = image[i][j] ^ 1;

                image[i][j] = image[i][image[i].length - j - 1] ^ 1;

                image[i][image[i].length - j - 1] = temp;
            }
        }

        return image;
    }
}
