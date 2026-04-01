import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0,k=n-1,index=n-1;
        int arr[]=new int[n];
        while(i<=k){

         if((Math.abs(nums[i]))>(Math.abs(nums[k]))){
               arr[index--]=nums[i]*nums[i];
               i++;
         }
         else{
            arr[index--]=nums[k]*nums[k];
            k--;
         }
        }
        return arr;
    }
}