class Solution {
    public int distanceBetweenBusStops(int[] dis, int s, int d) {
        int less=Math.min(s,d);
        int max=Math.max(s,d);
        // 
        int straight=0;

        for(int i=less;i<max;i++){
            straight+=dis[i];
        }

        int rev=0;
        int n=dis.length;
        for(int i=max;i<n;i++){
            rev+=dis[i];
        }
        for(int i=0;i<less;i++){
            rev+=dis[i];
        } 
        // return straight;

        return Math.min(straight,rev);
    }
}