class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int arr [][]=new int[rows*cols][2];
        int index=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[index][0]=i;
                arr[index][1]=j;
                index++;
            }
        }
        Arrays.sort(arr,(a,b)->{
            int dis1=Math.abs(a[0]-rCenter)+Math.abs(a[1]-cCenter);
            int dis2=Math.abs(b[0]-rCenter)+Math.abs(b[1]-cCenter);
            return dis1-dis2;
        });
        
        return arr;

    }
}