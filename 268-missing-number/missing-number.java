import java.util.HashSet;
class Solution {
    public int missingNumber(int[] nums) {
        int value=0;
       HashSet<Integer>h=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        h.add(nums[i]);
       }
       for(int i=0;i<=nums.length;i++){
       if(!(h.contains(i))){
        value=i;break;
       }
       }
       return value;
    }
}