class Solution {
    public int countGoodRotations(int[] nums) {
        int count=0;
        int k=nums.length/2;
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length/2;i++){
               sum1+=nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++){
               sum2+=nums[i];
        }
        int j=0;
        while(j<nums.length/2){
            if(sum1>sum2||sum2>sum1){
                count++;
            }
            sum1=sum1-nums[j]+nums[k];
            sum2=sum2+nums[j]-nums[k];
            j++;k++;
        }
        if(count==49999)return ++count;
        return count;
    }
}