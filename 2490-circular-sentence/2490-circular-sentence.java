class Solution {
    public boolean isCircularSentence(String sentence) {
        int n=sentence.length();
        boolean isTrue=true;
        String arr[]=sentence.split(" ");
        for(int i=0;i<arr.length-1;i++){
            String s0=arr[i];
            String s1=arr[i+1];
            int n1=s0.length();
            int n2=s1.length();
            if(s0.charAt(n1-1)!=s1.charAt(0)){
             isTrue=false;
             break;
            }
        }
        String word1=arr[0];
        String word2=arr[arr.length-1];

        if(isTrue && word1.charAt(0)==word2.charAt(word2.length()-1)){
            return true;
        }
        return false;
    }
}