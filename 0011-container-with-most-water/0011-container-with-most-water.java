class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        // pointers
        int i=0;
        int j = n-1;
        while(i<j){
            int c =(j-i)*(Math.min(height[i],height[j]));
            max = Math.max(c,max);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}