class Solution {
    public int countRotations(String s, int k) {
        /* s="aab" a,aa,aab*/
        int count=0;
        for(int i=0;i<s.length();i++){
            StringBuilder sb=new StringBuilder();
            sb.append(s.substring(i,s.length()));
            sb.append(s.substring(0,i));
            int score=0;
            for(int j=0;j<s.length()-1;j++){
                if(sb.charAt(j)==sb.charAt(j+1) ){
                    score++;
                }
            }
            if(score==k){
                count++;
            }
        }
         return count;
    }
}