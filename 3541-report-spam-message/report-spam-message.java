
class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
       HashSet <String> hs=new HashSet<>();
       int n1=message.length;
       int n2=bannedWords.length;
       int count=0;
       for(int i=0;i<n2;i++){
        hs.add(bannedWords[i]);
       }
        for(int i=0;i<n1;i++){
        if(hs.contains(message[i])){
            count++;
            if(count>=2)return true;
        }

       }
       return false;
    }
}