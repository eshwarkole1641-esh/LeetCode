class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=n;;i++){
           int x=i;
        int value=1;
        while(x>0){
            value*=x%10;
            x/=10;
        }
           if(value%t==0){
            return i;
           }
        }

    }
}