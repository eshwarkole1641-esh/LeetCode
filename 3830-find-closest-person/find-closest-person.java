class Solution {
    public int findClosest(int x, int y, int z) {
        int a=Math.abs(x-z);
        int b=Math.abs(y-z);
        int res=0;
        if(a>b){
            res=2;
        }
        else if(b>a){
            res=1;
        }
        else{
            res=0;
        }
        return res;
    }
}