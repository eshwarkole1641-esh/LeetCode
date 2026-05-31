import java.util.*;
class Solution {
    public int digitFrequencyScore(int n) {

        HashMap<Integer,Integer>hm=new HashMap<>();
        while(n>0){
            int num=n%10;
             hm.put(num,hm.getOrDefault(num,0)+1);
             n/=10;
        }
        int sum=0;
        for(int key:hm.keySet()){
            int value=hm.get(key);
            sum+=(value*key);
        }
        return sum;
    }
}