class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
       int arr[]=new int[101];
       for(int i=0;i<bulbs.size();i++){
        arr[bulbs.get(i)]++;
       }
       ArrayList<Integer>res=new ArrayList<>();
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2==1){
            res.add(i);
        }
       }
       return res;

    }
}