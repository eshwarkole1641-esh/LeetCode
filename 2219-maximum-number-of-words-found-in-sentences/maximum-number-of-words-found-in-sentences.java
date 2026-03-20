class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String x=sentences[i];
            String []arr=x.split(" ");
            if(max<arr.length)max=arr.length;
        }
        return max;
    }
}