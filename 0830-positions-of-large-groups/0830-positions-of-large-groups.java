class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>>list1=new ArrayList<>();
        int n=s.length();
        int count=1,start=0;
        for(int i=0;i<n-1;i++){
           char cur=s.charAt(i);
           char next=s.charAt(i+1);
           if(next==cur){
            count++;
            if(count==2){
                start=i;
            }
           }
           else{
            if(count>=3){
                List<Integer>list2=new ArrayList<>();
                list2.add(start);
                list2.add(i);
                list1.add(list2);
            }
            count=1;
           }
        }
        if(count>=3){
                List<Integer>list2=new ArrayList<>();
                list2.add(start);
                list2.add(n-1);
                list1.add(list2);
            }
        return list1;
    }
}