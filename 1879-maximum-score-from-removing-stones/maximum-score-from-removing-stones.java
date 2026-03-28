class Solution {
    public int maximumScore(int a, int b, int c) {
        int max=Math.max(a,b);
        max=Math.max(max,c);
        int min=Math.min(a,b);
        min=Math.min(min,c);
        int mid=a+b+c-min-max;
        int answer=Math.min(((a+b+c)/2),a+b+c-max);
        return answer;
    }
}