// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
               for(int j = i; j<nums.length; j++){
                    if(nums[j] != 0){
                        temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
               } 
            }
        }
        
    }
}