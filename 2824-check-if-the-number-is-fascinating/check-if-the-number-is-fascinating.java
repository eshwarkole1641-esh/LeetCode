class Solution {
    public boolean isFascinating(int n) {
        String s=""+n;
        boolean result=true;
        for(int i=2;i<=3;i++){
            s+=(n*i);
        }
       int arr[]=new int[9];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i)-'0';
        } 
        int hash[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
          hash[arr[i]]++;
        } 


       for(int i=0;i<hash.length;i++){
          if(hash[i]>1 ||hash[0]>0 ||hash[i]==0 && i!=0){
            result=false;
            break;
          }
          else{
            result=true;
          }
        } 

return result;

    }
}