// https://practice.geeksforgeeks.org/problems/find-transition-point-1587115620/1

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
        int left = 0, right = n-1,result = -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == 1){
                result = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return result;
    }
}
