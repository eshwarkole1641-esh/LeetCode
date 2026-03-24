class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap <Integer,Integer>map=new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            int complement=target-numbers[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        
        return new int[]{-1,-1};
        // int i=0;
        // int j=numbers.length-1;
        // while(i<j){
        //     if(numbers[i]+numbers[j]==target){
        //         return new int[]{i+1,j+1};
        //     }
        //     else if(numbers[i]+numbers[j]<target){
        //         i++;
        //     }
        //     else{
        //         j--;
        //     }
            
        // }
        // return new int[]{-1,-1};
    }
}