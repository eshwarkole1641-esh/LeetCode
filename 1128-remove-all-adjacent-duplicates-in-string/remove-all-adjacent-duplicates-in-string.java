class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        /*STRINGBUIILDER ACTS AS STACK 
        WHAT YOU DO IS GO THROUGH STACK IF DUPLICATE COMES REMOVE THE CHAR FROM BUILDER 
        ELSE APPEND
        */
        for(char c:s.toCharArray()){
           int len=sb.length();
           if(len>0 && sb.charAt(len-1)==c){
            sb.deleteCharAt(len-1);
           }
           else{
            sb.append(c);
           }
        }
        return sb.toString();
    
    }
}