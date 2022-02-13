// https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

class Solution {
    int bs(int[] arr, int n, int x, String cond){
        int left = 0, right = n-1, res = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] < x){
                left = mid+1;
            }
            else if(arr[mid] > x){
                right = mid-1;
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
    int count(int[] arr, int n, int x) {
        // code here
        int fs = bs(arr, n, x, "fs");
        int ls = bs(arr, n, x, "ls");
        if(fs == -1 || ls == -1) return 0;
        
        return(ls-fs+1);
        
    }
}
