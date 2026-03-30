class Solution {
    public int maxProfit(int[] arr) {
        int min=arr[0],profit=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            profit=Math.max(arr[i]-min,profit);
        }return profit;
    }
}