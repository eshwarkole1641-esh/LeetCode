class Solution {
    public int alternateDigitSum(int n) {
        int count=0;
        int x=n;
        while(x!=0){
            x/=10;
            count++;
        }
        int arr[]=new int[count];
        int sum=0;
        for(int i=count-1;i>=0;i--){
            arr[i]=n%10;
            n/=10;
           
        }
        for(int i=0;i<count;i++){
            if(i%2==0){
                sum+=arr[i];
            }
            else{
                sum-=arr[i];
            }
        }
        return sum;

    }
}