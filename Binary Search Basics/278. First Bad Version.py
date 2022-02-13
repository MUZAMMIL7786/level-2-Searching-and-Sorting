# https://leetcode.com/problems/first-bad-version/


class Solution:
    def firstBadVersion(self, n: int) -> int:
        left = 1; right = n; res = n
        while left <= right:
            mid = (left+right)//2
            if(isBadVersion(mid) == True):
                right = mid-1
                res = mid
            else:
                left = mid+1
        return res
