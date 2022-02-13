//https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1

// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



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
