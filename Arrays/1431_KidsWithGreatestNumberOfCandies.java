// Problem: Kids With the Greatest Number of Candies
// Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Approach: Find max, then check each kid
// TC: O(n)

import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        int max = 0;
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }
}
