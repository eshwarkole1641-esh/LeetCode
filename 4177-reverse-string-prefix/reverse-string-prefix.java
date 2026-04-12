class Solution {
    public String reversePrefix(String s, int k) {
        /*what's your approach
        first take str or strbuilder (prefer strbuilder)
        start from k-1 index to 0 add each in strbuil and them 
        start from k and addd each char to builder
        */
        StringBuilder sb=new StringBuilder();
        for(int i=k-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            sb.append(s.charAt(i));
        }
       return sb.toString();
    }
}