// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1, res = -1;
        while(left < right){
            int mid =(left + right) /2;
            if(nums[mid] > nums[right]){
                left = mid+1;
                res = nums[mid];
            }
            else if(nums[mid] < nums[right]){
                right = mid;
                res = nums[mid];
            }
            else{
                res = nums[right];
            }
            
        }
        return nums[right];
    }
}
