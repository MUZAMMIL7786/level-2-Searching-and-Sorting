// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
class Solution {
    public boolean search(int[] arr, int target) {
        int left = 0, right = arr.length-1, res = -1;
        while(left <= right){
            int mid = (left+right)/2;
            
            if(arr[mid] == target){
                return true;
            }
            
            if(arr[left] < arr[mid]){
                if(arr[left] <= target && target < arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else if(arr[left] > arr[mid]){
                if(arr[mid] < target && target <= arr[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            
            else{
                left++;
            }
        }
        return false;
    }
}
