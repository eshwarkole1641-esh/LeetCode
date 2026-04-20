class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;
        // HashSet<Integer> ref = new HashSet<>();
        // for(int i = 1; i<=n; i++){
        //       ref.add(i);
        // }
        // for(int i = 0; i < n; i++){

        //     HashSet<Integer> set1 = new HashSet<>(); // row
        //     HashSet<Integer> set2 = new HashSet<>(); // column

        //     for(int k = 0; k < n; k++){
        //         set1.add(matrix[i][k]);   // row elements
        //         set2.add(matrix[k][i]);   // column elements
        //     }

        //     if(!set1.equals(ref)||!set2.equals(ref)){
        //         return false;
        //     }
        // }
       
        for(int i=0;i<n;i++){
            boolean seen[]=new boolean[n+1];
            for(int j=0;j<n;j++){
                int value=matrix[i][j];
                if(value<1||value>n||seen[value]){
                    return false;
                }
                seen[value]=true;
            }
        }

        for(int j = 0; j < n; j++){
            boolean[] seen = new boolean[n + 1];

            for(int i = 0; i < n; i++){
                int val = matrix[i][j];

                if(val < 1 || val > n || seen[val]){
                    return false;
                }

                seen[val] = true;
            }
        }
        return true;
    }
}