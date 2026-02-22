class Solution {
    public int mostFrequent(int[] nums, int key) {
        int count=0,value=0,n=nums.length,target=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
           if(nums[i]==key){
            int next=nums[i+1];
            map.put(next, map.getOrDefault(next, 0) + 1);
           }
        }
        int res=0,maxF=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxF){
                maxF=entry.getValue();
                res=entry.getKey();
            }
        }
        return res;
    }
}