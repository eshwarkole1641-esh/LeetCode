class Solution {
    public int distMoney(int money, int children) {
       if(children>money){
        return -1;
       }

       money-=children;
       int ans=Math.min(money/7,children);
       money=money-ans*7;
       children-=ans;
       if(children==0){
           if(money>0)return ans-1;
           else return ans;
       }
       if(children==1&&money==3){
        return ans-1;
       }
return ans;

    }
}