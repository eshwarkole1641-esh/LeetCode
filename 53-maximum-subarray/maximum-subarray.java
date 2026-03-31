class Solution {
    public int maxSubArray(int[] nums) {
        int runSum=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            runSum+=nums[i];
            max=Math.max(runSum,max);
            if(runSum<0){
                runSum=0;
            
            }
            
        }
        return max;
    }
}