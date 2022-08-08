class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int output=0;
        while(left < right){
            int ht=Math.min(height[left],height[right]);
            int width=right-left;//8
            output=Math.max(output,ht*width);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return output;
    }
}
