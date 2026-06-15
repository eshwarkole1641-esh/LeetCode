class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
       int pref[]=new int[n];
       int suf[]=new int[n];
       int pr=0,su=0;
       for(int i=0;i<n;i++){
        pr+=nums[i];
        pref[i]=pr;
        su+=nums[n-i-1];
        suf[n-i-1]=su;
       }
      int count=0;
      for(int i=0;i<n-1;i++){
          int value=Math.abs(pref[i]-suf[i+1]);
          if(value%2==0){
            count++;
          }
          
      }
       return count;
    }
}