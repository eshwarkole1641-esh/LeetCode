class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int secMax=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }
            else if(secMax<nums[i]){
                secMax=nums[i];
            }
        }
        return (max-1)*(secMax-1);
    }
}