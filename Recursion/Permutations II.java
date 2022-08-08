class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> set=new HashSet<>();
        generate_perm(nums, 0,nums.length,set);
        return new ArrayList(set);
    }
public static void generate_perm(int[] nums,int start,int end,HashSet<List<Integer>> set){
    if(start==end){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           list.add(nums[i]);
        }
        set.add(list);
    }
    for(int j=start;j<nums.length;j++){
        swap(nums,start,j);
        generate_perm(nums,start+1,end,set);
        swap(nums,start,j);
    }
}
    public static void swap(int[] nums,int start,int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
}
