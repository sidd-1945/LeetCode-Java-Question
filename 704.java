// Example 1:

// Input: nums = [-1,0,3,5,9,12], target = 9
// Output: 4
// Explanation: 9 exists in nums and its index is 4
// Example 2:

// Input: nums = [-1,0,3,5,9,12], target = 2
// Output: -1
// Explanation: 2 does not exist in nums so return -1

class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, mid, t = target;
        while(start <= end){
            mid = (start + end)/2;
            if(nums[mid] == t){
                return mid;
            }else if(t < nums[mid]){
                end = mid-1;
            }else{
                start = mid + 1;
            } 
        }
        return -1;    
    }
}