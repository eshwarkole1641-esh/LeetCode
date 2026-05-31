import java.util.*;
class Solution {
    public int digitFrequencyScore(int n) {
        int len=0;
        int x=n;
        while(x>0){
            x/=10;
            len++;
        }
        int arr[]=new int[len];
        int k=0;
        while(n>0){
          arr[k++]=n%10;
          n/=10;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int sum=0;
        for(int key:hm.keySet()){
            int value=hm.get(key);
            sum+=(value*key);
        }
        return sum;
    }
}