class Solution {
    public long maxArrayValue(int[] nums) {
        int n=nums.length;
        long cur=nums[n-1];
        long max=Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            int x=nums[i];
            if(cur>=x){
                cur+=x;
                if(i==0) max=Math.max(cur,max);
            }
            else{
                max=Math.max(cur,max);
                cur=nums[i];
            }
        }
        return cur;
        // ArrayList<Integer>arr=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     arr.add(nums[i]);
        // }
        // for(int i=0;i<arr.size()-1;i++){
        //     if(arr.get(i)<=arr.get(i+1)){
        //         arr.set(i+1,arr.get(i)+arr.get(i+1));
        //         arr.remove(i);
        //     }
        // }
        // long res=0;
        // for(int i=0;i<arr.size()-1;i++){
        //     if(arr.get(i)<=arr.get(i+1)){
        //         res+=(arr.get(i)+arr.get(i+1));
        //     }
        // }
        // if(n<2)return nums[0];
        // return res;

    }
}