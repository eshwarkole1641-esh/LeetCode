
class Solution {
    public int smallestAbsent(int[] nums) {
    //    Arrays.sort(nums);
       int avg=0;
       for(int i=0;i<nums.length;i++){
        avg+=nums[i];
       } 
       if(avg>0)
       avg=(avg/nums.length);
       else
       avg=0;
    // //    avg+=1;
    //    boolean x=true;
    //    for(int i=0;i<nums.length;i++){
    //     if(avg+1==nums[i]){
    //         avg+=1;
    //     }
    //    }
    //    return avg+1;
    int n=nums.length;
  
    HashSet<Integer>h=new HashSet<>();
    for(int i=0;i<n;i++){
        h.add(nums[i]);
    }
    // if(avg<0)avg=0;
    // else avg/=nums.length;
    // int max=avg;
    //  for(int i=0;i<n;i++){
    //     if(avg<nums[i]){
    //         max=Math.max(avg,max);
    //     }
    // }
    // return max;
    for(int i=avg;i<=100;i++){
         if(avg<i && !(h.contains(i))){
            return i;
         }
         if(i==100)return i+1;
    }
    return avg+1;
    }
}