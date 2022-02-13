//https://leetcode.com/problems/guess-number-higher-or-lower/

class Solution:
    def guessNumber(self, n: int) -> int:
        left = 1; right = n; res = -1
        while(left <= right):
            mid = (left+right)//2
            if(guess(mid) == -1):
                right = mid-1
            elif(guess(mid) == 1):
                left = mid+1;
            else:
                return mid
        return res
        
