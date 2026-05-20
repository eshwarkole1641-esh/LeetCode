class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        int k=0;
        int res[]=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]==2){
                res[k++]=i;
            }
        }

return res;
    }
}