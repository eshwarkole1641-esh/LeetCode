class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       ArrayList<Boolean>x=new ArrayList<>();
       int max=candies[0];
       for(int i=0;i<candies.length;i++){
        if(max<candies[i]){
            max=candies[i];
        }

       }
        for(int i=0;i<candies.length;i++){

           if((candies[i]+extraCandies)>=max){
            x.add(true);
           }
           else{
            x.add(false);
           }
       }
       return x;
    }
}