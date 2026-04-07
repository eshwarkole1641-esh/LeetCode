import java.util.*;
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        // int n=s.length();
        //  String res="";
          StringBuilder res=new StringBuilder();
        // for(int i=n-1;i>=0;i--){
          
        //     if(s.charAt(i)!=' '){
        //         x=s.charAt(i)+""+x;
        //           if(i==0){
        //         res+=x;
        //         break;
        //     }
        //     }
        //     else{
        //         if(i>1 && s.charAt(i)==' '&&s.charAt(i-1)==' ')
        //         {
        //             continue;
        //         }
        //       res+=x+" ";
        //       x="";
        //     }
            
        // }
        // return res;
      String word[]=s.split("\\s+");
      int n=word.length;
      for(int i=n-1;i>=0;i--){
          res.append(word[i]);
          if(i!=0){
            res.append(" ");
          }
      }
      return res.toString();
    }
}