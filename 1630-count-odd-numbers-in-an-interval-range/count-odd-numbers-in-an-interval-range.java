class Solution {
    public int countOdds(int low, int high) {
       int n=(high-low);
       if(low%2==0 && high%2==0){
        return n/2;
       }
       else
        //((low%2!=0 && high%2!=0)||(low%==0 && high%2!=0))
        {
        return (n/2)+1;
       }
      
    }
}