class Solution {
    public int rearrangeCharacters(String s, String target) {
       int hashS[]=new int[26];
       int hashT[]=new int[26];


       for(int i=0;i<s.length();i++){
        hashS[s.charAt(i)-'a']++;
       } 
        for(int i=0;i<target.length();i++){
        hashT[target.charAt(i)-'a']++;
       } 
       int min=Integer.MAX_VALUE;

       for(int i=0;i<target.length();i++){
        int index = target.charAt(i) - 'a';
        min=Math.min(min,hashS[index]/hashT[index]);
       }
  return min;
    }
}