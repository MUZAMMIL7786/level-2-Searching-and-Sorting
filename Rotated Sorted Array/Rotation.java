// https://practice.geeksforgeeks.org/problems/rotation4723/1

class Solution {
    int find(int arr[], int left, int right){
        if(left == right) return left;
        int mid = (left+right)/2;
        if(arr[mid] < arr[right]) return find(arr, left, mid);
        if(arr[mid] > arr[right]) return find(arr, mid+1, right);
        
        return left;
    }
    
    int findKRotation(int arr[], int n) {
        // code here
        return(find(arr, 0, arr.length-1));
    }
}
