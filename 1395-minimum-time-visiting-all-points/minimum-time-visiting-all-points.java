class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time=0;
        int n=points.length;
       int j=0;
        for(int i=0;i<n-1;i++){
          int dif1=(Math.abs(points[i][0]-points[i+1][0]));
          int dif2=(Math.abs(points[i][1]-points[i+1][1]));
          time+=Math.max(dif1,dif2);
        }
       
        return time;
    }
}