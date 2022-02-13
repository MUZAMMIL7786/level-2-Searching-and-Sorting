# https://leetcode.com/problems/search-a-2d-matrix/submissions/

class Solution:
    def smatrix(self, arr, target):
        left = 0; right = len(arr)-1
        
        while(left <= right):
            mid = (left+right)//2
            if(arr[mid] == target):
                return True
            elif(arr[mid] < target):
                left = mid+1
            else:
                right = mid-1
        return False
        
    
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        rows = len(matrix); cols = len(matrix[0])
        for i in range(rows):
            if(matrix[i][0] <= target and matrix[i][cols-1] >= target):
                return self.smatrix(matrix[i], target)
