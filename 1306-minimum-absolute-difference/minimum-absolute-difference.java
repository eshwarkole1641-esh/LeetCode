class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minDif=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int dif=arr[i+1]-arr[i];
            minDif=Math.min(minDif,dif);
        }
        for(int i=1;i<arr.length;i++){
            int dif=arr[i]-arr[i-1];
            if(minDif==dif){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                result.add(pair);

            }
        }
        return result;
    }
}