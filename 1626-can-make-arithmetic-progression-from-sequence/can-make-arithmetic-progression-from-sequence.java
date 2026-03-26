import java.util.*;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
       int dif=arr[1]-arr[0];
       int n=arr.length;
       for(int i=2;i<n;i++){
        if(arr[i]-arr[i-1]!=dif){
            return false;
        }
       }
       return true; 
    }
}