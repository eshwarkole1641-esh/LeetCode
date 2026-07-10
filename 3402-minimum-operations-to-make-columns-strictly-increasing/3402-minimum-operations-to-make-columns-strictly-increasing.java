class Solution {
    public int minimumOperations(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=1;j<grid.length;j++){
                int cur=grid[j][i];
                if(grid[j-1][i]>=cur){
                    grid[j][i]=(grid[j-1][i])+1;
                    ans+=Math.abs(cur-grid[j][i]);
                }
            }
        }
        return ans;
        
    }
}