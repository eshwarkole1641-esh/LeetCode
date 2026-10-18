class Solution {
    public int minDeletions(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int xor=nums[i]^nums[i+1];
            if(xor==0){
                count++;
            }
        }
        return count;
    }
}