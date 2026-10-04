class Solution {
    public int minRotations(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            int dif=Math.abs(s.charAt(i)-s.charAt(i-1));
            if(dif<=5){
                count+=dif;
            }
            else{
                count+=(10-dif);
            }
        }
        if(s.charAt(0)!='0'){
            int dif=Math.abs(s.charAt(0)-'0');
            if(dif<=5){
                count+=dif;
            }
            else{
                count+=(10-dif);
            }
        }
        return count;
        
    }
}