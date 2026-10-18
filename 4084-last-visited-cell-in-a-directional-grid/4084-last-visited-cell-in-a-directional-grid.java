class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean values[][]=new boolean[m][n];
        int r=0,c=0;
        values[0][0]=true;
        while(true){
            int nc=c,nr=r;
            if(grid[r][c]=='U')nr--;
            else if(grid[r][c]=='D')nr++;
            else if(grid[r][c]=='L')nc--;
            else if(grid[r][c]=='R')nc++;
            if(nr>=m||nr<0||nc>=n||nc<0)break;
            if(values[nr][nc])break;
            r=nr;
            c=nc;
            values[r][c]=true;
        }
        return new int[]{r,c};
    }
}