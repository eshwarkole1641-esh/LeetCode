class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder s1=new StringBuilder();
         StringBuilder s2=new StringBuilder();
         int n=0;
        //  if(word1.length()>word2.length()){
        //     n=word1.length();
        //  }
        //  else{
        //     n=word2.length();
        //  }
         for(int i=0;i<word1.length;i++){
             s1.append(word1[i]);
         }
         for(int i=0;i<word2.length;i++){
             s2.append(word2[i]);
         }
         return (s1.toString()).equals(s2.toString());
    }
}