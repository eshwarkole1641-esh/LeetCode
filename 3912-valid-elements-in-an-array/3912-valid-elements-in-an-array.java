class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        list.add(nums[0]);
        int current_max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1){
                list.add(nums[i]);
                break;
            }
            int count=0;
              for(int j=0;j<i;j++){
                   if(nums[j]<nums[i]){
                    count++;
                   }
                   else{
                    count=0;
                    break;
                   }
              }
              if(count==i){
                list.add(nums[i]);
                count=0;
                continue;
              }
              else{
                count=0;
              }
              for(int j=i;j<nums.length;j++){
                    int x=i;
                   if(nums[x]>nums[j]){
                    count++;
                   }
              }
              if(count==nums.length-i-1){
                list.add(nums[i]);
                count=0;
              }
            

        }
        return list;
    }
}