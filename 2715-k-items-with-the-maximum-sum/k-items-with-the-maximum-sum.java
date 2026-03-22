class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k<=numOnes){
            return k;
        }
       
        else if(numOnes+numZeros>=k){
            return numOnes;
        }
        else{
           int x=numOnes;
           int value=numOnes+numZeros;
           while(k!=value){
            value+=1;x-=1;
           }
           return x;
        }


    }
}