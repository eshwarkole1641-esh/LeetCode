import java.util.*;
class Solution {
    public boolean checkDistances(String s, int[] distance) {
    int n=s.length();
    int firstIndex[]=new int[26];
    Arrays.fill(firstIndex,-1);
    boolean res=true;
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(firstIndex[ch-'a']==-1){
            firstIndex[ch-'a']=i;
        }
        else{
            int dist=i-firstIndex[ch-'a']-1;
            if(distance[ch-'a']!=dist){
                res=false;
            }
        }
    }
    return res;
                
    }
}