class Solution {
    public int countCharacters(String[] words, String chars) {
        // HashSet<Character>h=new HashSet<>();
        // for(int i=0;i<chars.length();i++){
        //     h.add(chars.charAt(i));
        // }
        // int count=0;
        // for(int i=0;i<words.length;i++){
        //     String s=words[i];
        //     int c=0;
        //     for(int j=0;j<s.length();j++){
        //         if(h.contains(s.charAt(j))){
        //              c++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //    if(c==s.length()){
        //     count+=c;
        //    } 
        // }
        // return count;
        int total=0;
        for(String word:words){
            int fre[]=new int[26];
            for(char c:chars.toCharArray()){
                fre[c-'a']++;

            }
            boolean valid=true;
            for(char c:word.toCharArray()){
                fre[c-'a']--;
                if(fre[c-'a']<0){
                    valid=false;
                    break;
                }

            }
            if(valid){
                total+=word.length();
            }
        }
        return total;
    }
}