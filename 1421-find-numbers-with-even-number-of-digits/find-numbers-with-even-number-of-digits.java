class Solution {
    public int findNumbers(int[] nums) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<nums.length;i++){
        int n=nums[i];
        int check=0;
        while(n>0){
          check++;
          n/=10;
        }
        if(check%2==0){
            count++;
        }
        }
        return count;
    }
}