class Solution:
    def searchInsert(self, arr: List[int], target: int) -> int:
        left = 0; right = len(arr)-1
        while(left <= right):
            mid = (left+right)//2
            
            if(arr[mid] == target):
                return mid
            elif(arr[mid] < target):
                res = mid+1
                left = mid+1
            else:
                res = mid
                right = mid-1
        return res
                
            
