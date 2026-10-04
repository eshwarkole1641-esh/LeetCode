class Solution {
    public int cost(char a,char b){
        int dif=Math.abs(a-b);
        if(dif<=5){
            return dif;
        }
        else{
            return 10-dif;
        }
    }
    public int minRotations(int n, String s) {
        int total=cost(s.charAt(0),'0');
        for(int i=1;i<n;i++){
            total+=cost(s.charAt(i-1),s.charAt(i));
        }
        int ans=total;
        //if k=0;
        int newCost=total-cost(s.charAt(0),'0')+cost('0',s.charAt(n-1));
        ans=Math.min(ans,newCost);
        //k>0
        for(int k=1;k<n;k++){
            newCost=total-cost(s.charAt(k-1),s.charAt(k))+cost(s.charAt(k-1),s.charAt(n-1));
            ans=Math.min(newCost,ans);
        }
        return ans;
    }
}