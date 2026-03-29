class Solution {
    public int maxFreqSum(String s) {
        char []arr=s.toCharArray();
        int maxVowels=0;
        int maxConsonants=0;
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
          hash[(s.charAt(i))-97]++;
        }
          for(int i=0;i<26;i++){
          char alph=(char)(97+i);
          if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u'){
             maxVowels=Math.max( maxVowels,hash[i]);
          }
          else{
            maxConsonants=Math.max(maxConsonants,hash[i]);
          }

        }
        return maxConsonants+maxVowels;
    }
}