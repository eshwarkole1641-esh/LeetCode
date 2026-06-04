class Solution {
    public int minSensors(int n, int m, int k) {
        int rad=(2*k)+1;
        int row=(n+rad-1)/rad;
        int col=(m+rad-1)/rad;
        return row*col;

    }
}