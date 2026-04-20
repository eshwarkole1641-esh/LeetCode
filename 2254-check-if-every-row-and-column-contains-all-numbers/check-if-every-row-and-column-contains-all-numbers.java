class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;
        HashSet<Integer> ref = new HashSet<>();
        for(int i = 1; i<=n; i++){
              ref.add(i);
        }
        for(int i = 0; i < n; i++){

            HashSet<Integer> set1 = new HashSet<>(); // row
            HashSet<Integer> set2 = new HashSet<>(); // column

            for(int k = 0; k < n; k++){
                set1.add(matrix[i][k]);   // row elements
                set2.add(matrix[k][i]);   // column elements
            }

            if(!set1.equals(ref)||!set2.equals(ref)){
                return false;
            }
        }

        return true;
    }
}