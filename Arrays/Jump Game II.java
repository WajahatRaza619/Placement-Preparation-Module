class Solution {
    public int jump(int[] nums) {
        int c=0;
        int curr_max=0;
        int curr_reach=0;
        for(int i=0;i<nums.length-1;i++){
            if(i+nums[i] > curr_max){
                curr_max=i+nums[i];
            }
            if(i==curr_reach){
                c++;
                curr_reach=curr_max;
            }
        }
        return c;
    }
}
