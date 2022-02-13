class Solution {
    public int search(int[] nums, int target) {
        int left =0, right = nums.length-1;
        while (left <= right){
            int mid = (left+right)/2;
            System.out.println(mid);
            if (target < nums[mid]){
                right = mid-1;
            }
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
