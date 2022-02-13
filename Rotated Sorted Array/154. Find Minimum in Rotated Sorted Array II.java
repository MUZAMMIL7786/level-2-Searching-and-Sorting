// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
class Solution {
    public int min(int[] nums, int left, int right){
        
        if(left == right) return nums[left];
        int mid = (left+right)/2;
        if(nums[mid] < nums[right]) return min(nums, left, mid);
        if(nums[mid] > nums[right]) return min(nums, mid+1, right);
        return min(nums, left, right-1);
    }
    
    public int findMin(int[] nums) {
        //return min(nums, 0, nums.length-1);
        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] < nums[right]) right = mid;
            else if(nums[mid] > nums[right]) left = mid+1;
            else right--;
        }
        return nums[right];
    }
}
