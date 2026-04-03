class Solution {
    public int findNumbers(int[] nums) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
            if(sb.length()%2==0){
                count++;
            }
            sb.delete(0,sb.length());
        }
        return count;
    }
}