class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int n=nums.length;
        if(n<3){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=j;k<n;k++)
                set.add(nums[i]^nums[j]^nums[k]);
            }
        }
        return set.size();
        }
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        
        }
        int count=0;
        while(max>0){
           count++;
           max>>=1;
        }
       return 1<<count;
    }
}