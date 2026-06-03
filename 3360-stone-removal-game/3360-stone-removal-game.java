class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)return false;
        int stand=10;
        int i=0;
        while(n>0){
          n-=stand;
          stand--;
          i++;
          if(n<stand){
            if(i%2==0){
                return false;
            }
            else{
                return true;
            }
          }
        }
        return false;
    }
}