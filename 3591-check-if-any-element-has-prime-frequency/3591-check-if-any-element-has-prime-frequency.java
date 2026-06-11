class Solution {

    public static boolean prime(int n){
        // int count=0;
        //     while(i<=value){
        //         if(value%i==0){
        //             count++;
        //         }
        //     i++;
        // } 
        //  if(count==2){
        //         return true;
        //     }   
        // return false;
         if(n < 2)
            return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap <Integer,Integer>hm=new HashMap<>();
        for(int x:nums){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        // for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
        //     int value=entry.getValue();
        //     int i=1;
        //     boolean res=prime(value,i);
        //     if(res){
        //         return true;
        //     }
        // }
        // return false;
        for(int freq : hm.values()){
            if(prime(freq)){
                return true;
            }
        }

        return false;
    }
}