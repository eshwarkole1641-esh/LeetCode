class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashSet<Integer>set1=new HashSet<>();
          HashSet<Integer>set2=new HashSet<>();
        int n=nums.length;
        // for(int i=0;i<n;i++){
        //     hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        // }
        // int res[]=new int[2];
        // res[]=-1;
        int arr[]=new int[101];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                if(set2.contains(arr[i])){
                    continue;
                }
                else{
                    set2.add(arr[i]);
                    set1.add(i);
                    if(set1.size()==2){
                        Integer[] result = set1.toArray(new Integer[0]);
                        Arrays.sort(result);
                        return new int[]{result[0], result[1]};
                    }
                }
            }
        }
     
        return new int[]{-1,-1};
    }
}