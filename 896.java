// Example 1:

// Input: nums = [1,2,2,3]
// Output: true
// Example 2:

// Input: nums = [6,5,4,4]
// Output: true
// Example 3:

// Input: nums = [1,3,2]
// Output: false

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dec = false; 
            }
            if (nums[i] < nums[i - 1]) {
                inc = false;
            }
        }

        return inc || dec;
    }
}
