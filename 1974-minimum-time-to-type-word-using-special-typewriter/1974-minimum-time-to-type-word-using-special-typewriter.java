class Solution {
    public int minTimeToType(String word) {
        // char arr[]=word.toCharArray();
        int n=word.length();
        // int res=0;
        // for(int i=0;i<n-1;i++){
        //  char c=(char)(word.charAt(i)-0);
        //  char d=(char)(word.charAt(i+1)-0);
        //  int dist=Math.abs(c-d);
        //  if(dist>13){
        //     dist=26-dist;
        //  }

        //  res+=dist;
        // }
        // res+=(1+n);
        // if(word.charAt(0)=='a')res-=1;
        // return res;
        char cur='a';
        int res=0;
        for(int i=0;i<n;i++){
            char target=word.charAt(i);
            int dis=Math.abs(cur-target);
            if(dis>13){
                dis=26-dis;

            }
            res+=dis;//rotate
            res+=1;//type
            cur=target;
        }
        return res;
    }
}