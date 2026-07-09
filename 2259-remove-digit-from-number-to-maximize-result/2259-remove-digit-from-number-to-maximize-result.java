import java.math.BigInteger;
class Solution {
    public String removeDigit(String number, char digit) {
        StringBuilder sb=new StringBuilder(number);
        int n=number.length();
        ArrayList<String>list=new ArrayList();
        // if(number.charAt(0)==number.charAt(n-1))return number.substring(1);
        for(int i=0;i<n;i++){
            if(sb.charAt(i)==digit){
                String temp=number.substring(0,i)+number.substring(i+1);
                
                list.add(temp);
            }
        }
        int flag=0;
        BigInteger value=new BigInteger("0");
        for(int i=0;i<list.size();i++){
            String str1=list.get(i);
            BigInteger num = new BigInteger(str1);
            if(num.compareTo(value)>0){
                value=num;
                flag=i;
            }
        }
        return list.get(flag);
        
    }
}