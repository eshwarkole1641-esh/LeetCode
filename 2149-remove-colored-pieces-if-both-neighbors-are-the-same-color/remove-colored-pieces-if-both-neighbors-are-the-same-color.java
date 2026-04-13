class Solution {
    public boolean winnerOfGame(String colors) {
        boolean res=false;
        int n=colors.length();
        int value=0;
        int A=0,B=0;
        for(int i=1;i<n-1;i++){
            if(colors.charAt(i-1)==colors.charAt(i)&&colors.charAt(i)==colors.charAt(i+1) && colors.charAt(i)=='A'){
                A++; 
            }
            if(colors.charAt(i-1)==colors.charAt(i)&&colors.charAt(i)==colors.charAt(i+1) && colors.charAt(i)=='B'){
                B++;
            }
           
        }
        return A>B;
}
}