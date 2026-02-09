
class Solution {
    public int countElements(int[] nums) {
        if(nums.length<2)return 0;
        int small=nums[0],max=nums[0];
       for(int i=0;i<nums.length;i++){
            if(nums[i]<small){
                small=nums[i];
            }
            else if(nums[i]>max){
                max=nums[i];
            }
            else{
                continue;
            }
       }
       int count=0;

          for(int i=0;i<nums.length;i++){
            if(nums[i]>small && nums[i]<max){
               count++;
       }
     
    }
    return count;
}
}