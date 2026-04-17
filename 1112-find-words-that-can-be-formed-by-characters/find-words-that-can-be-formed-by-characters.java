class Solution {
    public int countCharacters(String[] words, String chars) {
        //BRUTEFORCE
        // int total=0;
        // for(String word:words){
        //     int fre[]=new int[26];
        //     for(char c:chars.toCharArray()){
        //         fre[c-'a']++;

        //     }
        //     boolean valid=true;
        //     for(char c:word.toCharArray()){
        //         fre[c-'a']--;
        //         if(fre[c-'a']<0){
        //             valid=false;
        //             break;
        //         }

        //     }
        //     if(valid){
        //         total+=word.length();
        //     }
        // }

        // OPTIMAL
        int total=0;
           int base[]=new int[26];
            for(char c:chars.toCharArray()){
                base[c-'a']++;
            }
            for(String word:words){
                int temp[]=base.clone();
                boolean valid=true;
                for(char c:word.toCharArray()){
                    temp[c-'a']--;
                    if(temp[c-'a']<0){
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