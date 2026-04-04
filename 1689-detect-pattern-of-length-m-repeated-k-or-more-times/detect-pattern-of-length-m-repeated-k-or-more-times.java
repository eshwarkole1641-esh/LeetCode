class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n-m;i++){
            if(arr[i]==arr[i+m]){
                count++;
            }
            else{
                count=0;
            }
            if(count==(k-1)*m){
                return true;
            }
        }
        return false;
//          for(int i=0;i<=n-m*k;i++){
//             boolean valid=true;
//           for(int j=1;j<k;j++){
//             for(int x=0;x<m;x++){
//                if(arr[i+x]!=arr[i+(j*m)+x]){
//                   valid=false;
//                   break;
//                } 
//             }
//              if(!valid){
//             break;
//          }
//           }
//          if(valid)return true;
//         }
//       return false;
    }
}