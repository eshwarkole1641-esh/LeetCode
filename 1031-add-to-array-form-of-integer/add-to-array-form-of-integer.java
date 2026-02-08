class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> l=new ArrayList<>();
        int carry=0;
        int i=num.length-1;
        while(i>=0 || carry>0 ||k>0){
            int nDigit=(i>=0)?num[i]:0;
            int kDigit=k%10;
            int sum=nDigit+kDigit+carry;
            l.add(sum%10);
            carry=sum/10;
            i--;
            k/=10;
        }
        Collections.reverse(l);
        return l;

    }
}