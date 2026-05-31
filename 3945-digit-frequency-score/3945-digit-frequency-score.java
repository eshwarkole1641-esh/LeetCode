import java.util.*;
class Solution {
    public int digitFrequencyScore(int n) {
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        // if(n==0)return 0;

        // HashMap<Integer,Integer>hm=new HashMap<>();
        // while(n>0){
        //     int num=n%10;
        //      hm.put(num,hm.getOrDefault(num,0)+1);
        //      n/=10;
        // }
        // int sum=0;
        // for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
        //     int key=entry.getKey();
        //     int value=entry.getValue();
        //     sum+=(value*key);
        // }
        return sum;
    }
}