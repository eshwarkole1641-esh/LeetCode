class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=i+"";
            int n=s.length();
            if(n%2!=0){
                continue;
            }
            int sq=(int)Math.pow(10,n/2);
            int s1=0,s2=0;
            int x=n/2;
            int value1=(i/sq),value2=i%sq;
            while(x>0){
                s1+=value1%10;
                value1/=10;
                s2+=value2%10;
                value2/=10;
                x--;
            }
            if(s1==s2)count++;
        }
        return count;
    }
}