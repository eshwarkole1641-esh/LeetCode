class Solution {
    public int minChanges(int n, int k) {
        StringBuilder b1=new StringBuilder();
        StringBuilder b2=new StringBuilder();
       
        if(n==k)return 0;
        while(n>0){
            b1.append(n%2);n/=2;
        }
        while(k>0){
            b2.append(k%2);k/=2;
        }
        String s1=b1.reverse().toString();
        String s2=b2.reverse().toString();
        int a1=s1.length();
        int a2=s2.length();
        if(a1>a2){
            for(int i=0;i<a1-a2;i++){
                s2='0'+s2;
            }
        }
         else if(a2>a1){
            for(int i=0;i<a2-a1;i++){
                s1='0'+s1;
            }
        }
        int count=0;
        for(int i=0;i<s1.length();i++){
            // if(s1.charAt(i)=s2.charAt(i)&& s1.charAt(i)=='1'){count++;}
            if(s1.charAt(i)=='0'&& s2.charAt(i)=='1'){
                return -1;
                }
               if(s1.charAt(i)!=s2.charAt(i)&& s1.charAt(i)=='1'){
                    count++;
                    }
        }
    return count;
    }
}