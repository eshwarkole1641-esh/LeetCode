import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        Arrays.sort(nums);
        int count=1;
        int total=0;
        int value=0;
        
        for(int i=0;i<n-1;i++){
         if(nums[i]==nums[i+1]){
            count++;
            if(i+1==n-1 && count>total){
                total=count;
                value=nums[i];
            }
         }
         else{
            if(count>total){
                 total=count;
           value=nums[i];
           count=1;
            }
            else{
                count=1;
            }
         }
        }
        if(n<2){
         value=nums[0];
        }
        
        return value;



    }
}