class Solution {
    public int minIncrementForUnique(int[] nums) {

        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
             if(nums[i]<=nums[i-1]){
                  int next=nums[i-1]+1;
                  count+=next-nums[i];
                  nums[i]=next;
             }
        }
        return count;
        // List<Integer>list=new ArrayList<>();
        // TreeSet<Integer>set=new TreeSet<>();
        // for(int num:nums){
        //     if(set.contains(num)){
        //         list.add(num);
        //     }
        //     else{
        //         set.add(num);
        //     }
        // }
        // int a=0,res=0;
        // for(int x:set){
        //     if(!(set.contains(x+1))){
        //         res=x+1-list.get(a);
        //         list.remove(list.get(a));
        //     }

        // }
    //   return res;
    }
}