class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append(nums[i]);
        }
        int count=0;
        String x=digit+"";
        for(int i=0;i<sb.length();i++){
            char c=sb.charAt(i);
            if(x.charAt(0)==c){
                count++;
            }
        }
        return count;
    }
}