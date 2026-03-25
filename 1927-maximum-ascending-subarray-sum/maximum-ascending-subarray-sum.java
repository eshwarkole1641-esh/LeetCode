class Solution {
    public int maxAscendingSum(int[] nums) {
        /*
        declare maxx to store the maximum values
        traverse through the array if the element is greater than the previous element then add to count
        else check count with max 
        continue array ends
        */
       int max=nums[0],count=nums[0];
       for(int i=1;i<nums.length;i++){
           if(nums[i-1]<nums[i]){
            count+=nums[i];
            if(i==nums.length-1){
                max=Math.max(max,count);
            }
           }
           else{
            max=Math.max(count,max);
            count=nums[i];
           }
       }
       return max; 
    }
}