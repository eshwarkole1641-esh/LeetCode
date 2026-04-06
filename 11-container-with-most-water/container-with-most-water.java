import java.util.*;
class Solution {
    public int maxArea(int[] height) {
      
       int n=height.length;
       int area=0;
       int left=0,right=n-1;
        while(left<right){
        area=Math.max(area,((right-left)*Math.min(height[right],height[left])));
        if(height[right]>height[left]){
            left++;
        }
        else{
            right--;
        }
        
       }
       return area;
    }
}