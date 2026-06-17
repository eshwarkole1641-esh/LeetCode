class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int extra=0;
        int n=mainTank;
        int km=0;
        if(mainTank<5)return mainTank*10;
        while(mainTank>=5){
            mainTank-=5;
            extra++;
            if(extra<=additionalTank)
            mainTank++;
            km+=50;
        }
        
        return km+(mainTank*10);

    }
}