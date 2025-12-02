// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int numsum = 0;
            for (int j = i; j < nums.length; j++) {
                numsum += nums[j];
                if (numsum == k) {
                    count++;
                    
                }
            }
        }
        return count;
    }
}