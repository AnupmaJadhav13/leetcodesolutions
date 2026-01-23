// You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.
// Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.

 
// Example 1:
// Input: grid = [[1,3],[2,2]]
// Output: [2,4]
// Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].

// Example 2:
// Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
// Output: [9,5]
// Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
 

 class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        // if u use hash HashSet<Integer> set=new HashSet<>(); rather than array

        int n=grid.length;
        int sq= n*n;
        int set[] =new int[sq+1]; //array used


        //1,sq
        int currentsum =0;
        int ans[] =new int[2];

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n; j++)
            {
                // for hash if(set.contains(grid[i][j]))
                if(set[grid[i][j]] != 0)
              x
            }
        }

        int totalsum = sq *(sq+1)/2;
        ans[1]=totalsum - currentsum;
        return ans;
        
    }
}