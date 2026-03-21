class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int n=gain.length;
        // int values[]=new int[n+1];
        int res=0;
        // values[0]=altitude;
        for(int i=0;i<n;i++){
            res+=gain[i];
            if(altitude<res){
                altitude=res;
            }
           
        }
        return altitude;
         
    }
}