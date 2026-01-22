// Given an integer array nums, return the most frequent even element.
// If there is a tie, return the smallest one. If there is no such element, return -1.

// Example 1:
// Input: nums = [0,1,2,2,4,4,1]
// Output: 2
// Explanation:
// The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
// We return the smallest one, which is 2.

// Example 2:
// Input: nums = [4,4,4,9,2,4]
// Output: 4
// Explanation: 4 is the even element appears the most.


import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int maxFreq = 0;
        int answer = -1;

        // Find most frequent even (smallest in case of tie)
        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq || (freq == maxFreq && key < answer)) {
                maxFreq = freq;
                answer = key;
            }
        }

        return answer;
    }
}
