class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
       int k=0;
        for(int x:nums1){
          set.add(x);
        }
          for(int x:nums2){
          if(set.contains(x)){
            res.add(x);
          }
        }
        int arr[]=new int[res.size()];
        int i=0;
        for(int x:res){
            arr[i++]=x;
        }
      return arr;
    }
}