
class Solution {
    public int smallestAbsent(int[] nums) {
       Arrays.sort(nums);
       int avg=0;
       for(int i=0;i<nums.length;i++){
        avg+=nums[i];
       } 
       if(avg>0)
       avg=(avg/nums.length);
       else
       avg=0;
    //    avg+=1;
       boolean x=true;
       for(int i=0;i<nums.length;i++){
        if(avg+1==nums[i]){
            avg+=1;
        }
       }
       return avg+1;
    }
}