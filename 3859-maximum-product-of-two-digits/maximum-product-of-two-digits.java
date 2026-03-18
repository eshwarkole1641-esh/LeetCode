class Solution {
    public int maxProduct(int n) {
        int product=1;
        ArrayList<Integer>a=new ArrayList<>();
        while(n!=0){
            a.add(n%10);
            n/=10;
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){
        if(max<a.get(i)){
            secMax=max;
            max=a.get(i);
        }
        else{
            if(secMax<a.get(i)){
                secMax=a.get(i);
            }
        }
        }
        return max*secMax;
        
    }
}