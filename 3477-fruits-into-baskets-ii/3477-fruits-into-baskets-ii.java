class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=0;
        int n1=fruits.length,n2=baskets.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(fruits[i]<=baskets[j]){
                    count++;
                    baskets[j]=0;
                    break;
                }
            }
        }
        return n1-count;
    }
}