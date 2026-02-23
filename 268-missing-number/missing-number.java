class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x1=0,x2=0;
        for(int i=0;i<n;i++){
            x1^=nums[i];
        }
        for(int i=1;i<=n;i++){
            x2^=i;
        }
        return x2^x1;
    }
}