class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean res=true;
        for(int i=0;i<nums.length-1;i++){
            if(!(nums[i]%2==0 && nums[i+1]%2!=0||nums[i]%2!=0 && nums[i+1]%2==0)){
                res=false;break;
            }
        }
        return res;
    }
}