class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max=0;
    //     /*
    //     you are given a string
    //     what to do?
    //     find the max vowels in a substring of length k
    //     if elements reach limit then shrink and move
    //     */
    //    for(int i=0;i<=n-k;i++){
    //     int count=0;
    //     for(int j=i;j<i+k;j++){
    //         char c=s.charAt(j);
    //         if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
    //             count++;
    //         }
    //     }
    //     maxCount=Math.max(count,maxCount);
    //    }
    //     return maxCount;
    int left=0;
    StringBuilder sb=new StringBuilder();
    // FIRST WINDOW
     int count=0;
    for(int i=0;i<k;i++){
        sb.append(s.charAt(i));
          char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
    }
    max=Math.max(max,count);
    
     for(int i=k;i<n;i++){
          char c=s.charAt(i-k);
          char c1=s.charAt(i);
         
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count--;
            }
           if(c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u'){
                count++;
            }
             max=Math.max(max,count);
    }
   return max;
    }
}