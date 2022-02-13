// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int bs(int[] nums, int target, String cond){
        int left = 0, right = nums.length-1, res = -1;
        
        while(left <=right){
            int mid = (left+right)/2;
            if(target < nums[mid]){
                right = mid-1;
            }
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                if(cond == "fs"){
                    right = mid-1;
                    res = mid;
                }
                else{
                    left = mid+1;
                    res = mid;
                }
            }
        }
        return res;
    }
    
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if(nums.length == 0) return new int[]{-1, -1};
        res[0] = bs(nums, target, "fs");
        res[1] = bs(nums, target, "ls");
        return res;
    }
}
