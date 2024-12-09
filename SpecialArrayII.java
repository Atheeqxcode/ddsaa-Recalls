public class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
          int n = nums.length;
          boolean[] result = new boolean[queries.length];
          
          int[] violations = new int[n];
          
          for (int i = 1; i < n; i++) {
              if (nums[i] % 2 == nums[i - 1] % 2) {
                  violations[i] = 1; // Mark as a violation
              }
          }
          
          for (int i = 1; i < n; i++) {
              violations[i] += violations[i - 1];
          }
          
          for (int i = 0; i < queries.length; i++) {
              int from = queries[i][0];
              int to = queries[i][1];
              
              if (violations[to] - violations[from] == 0) {
                  result[i] = true;
              } else {
                  result[i] = false;
              }
          }
          
          return result;
      }
  } {
    
}
