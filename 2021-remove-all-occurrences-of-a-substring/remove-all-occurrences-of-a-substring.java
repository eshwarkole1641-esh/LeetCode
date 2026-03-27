class Solution {
    public String removeOccurrences(String s, String p) {
        
        int n=s.length();
        int m=p.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            sb.append(c);
            while(sb.length()>=m && sb.substring(sb.length()-m).equals(p)){
              sb.delete((sb.length()-m),sb.length());
            }
        }
        return sb.toString();
    }
}