class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Set<List<Integer>> ls=new HashSet<>();
        generate_perm(nums,0,nums.length-1,ls);
        return new ArrayList(ls);
    }
public static void generate_perm(int[] nums,int start,int end,Set<List<Integer>> ls){
    if(start==end){
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
          al.add(nums[i]);
        }
        ls.add(al);
    }
    for(int i=start;i<=end;i++){
        swap(nums,start,i);
        generate_perm(nums,start+1,end,ls);
        swap(nums,start,i);
    }
}
public static void swap(int[] nums,int i,int j){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
}
