class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowSum=0;
        double maxAverage=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        maxAverage=Math.max(maxAverage,(windowSum)/k);
         for(int i=k;i<nums.length;i++){
            windowSum=windowSum+nums[i]-nums[i-k];
             maxAverage=Math.max(maxAverage,(windowSum)/k);
        }
        return maxAverage;
    }
}