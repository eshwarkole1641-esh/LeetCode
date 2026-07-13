class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        // first take all the pos of values in length n1 for low and high
        // and keep the values that present inside the range
        String s1=""+low;
        String s2=""+high;
        int n1=s1.length();
        int n2=s2.length();
        ArrayList<Integer>list=new ArrayList<>();
        for(int len=n1;len<=n2;len++){
            for(int start=1;start<=10-len;start++){
                String s="";
                for(int d=start;d<start+len;d++){
                     s+=d;
                }
                int num=Integer.parseInt(s);
                if(num>=low && num<=high){
                    list.add(num);
                }
            }
        }
        return list;
         
    //     /*first traverse from low to high
    //     make a string of number
    //     make it as char arr
    //     check every char with adj one
    //     if i<i+1 then move next else stop*/
    //     ArrayList<Integer>list=new ArrayList<>();
    //     // low 100--high--200 ,
    //     // for(int i=low;i<=high;i++){
    //     //     String s=""+i;
    //     //     char []arr=s.toCharArray();
    //     //     for(int j=0;j<arr.length;)
    // //     }
    // //    while(low<=high){
    // //         String s="";
    // //         String l=""+low;
    // //         int n=l.length();
    // //         int f=l.charAt(0)-'0';
    // //         // System.out.print(f);break;
    // //         while(n>0 ){
    // //           s+=f;
    // //           f++;
    // //           n--;
    // //         }
    // //         // BigInteger num = new BigInteger(str);
    // //         long num = Long.parseLong(s);
    // //         if(num >= low && num <= high && !(list.contains((int)num))){
    // //             list.add((int)num);
    // //         }
    // //     //     if(Integer.parseInt(s)<=high && !(list.contains(Integer.parseInt(s)))){
    // //     //    list.add(Integer.parseInt(s));
    // //     //     }

    // //        low+=x;
          

    // //     }  int x=low;
       
    //     String s1=""+low;
    //     int n1=s1.charAt(0)-'0';
    //     String s2=""+high;
    //     int n2=s2.charAt(0)-'0';
    //     for(int i=n;i<=n2;i++){
    //         while()
    //     }
        // return list;
    }
}