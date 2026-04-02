class Solution {
    public void sortColors(int[] nums) {
        /*
        we are given with three colours with many numbers we should sort them 
        take three pointers 
        low: to check which element and solve 
        mid:*/
        int n=nums.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else{
                mid++;
            }
        }
       
    }
}