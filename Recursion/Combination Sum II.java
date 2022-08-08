class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        generateSets(0,candidates,new ArrayList(),res,target);
        return res;
    }
public static void generateSets(int start,int[] arr,List<Integer> curr,List<List<Integer>> res,int target){
    if(target==0){
        res.add(new ArrayList(curr));
        return;
    }
    if(target<0) return;
    
    for(int i=start;i<arr.length;i++){
        if(i>start && arr[i]==arr[i-1]) continue;
        curr.add(arr[i]);
        generateSets(i+1,arr,curr,res,target-arr[i]);
        curr.remove(curr.size()-1);
    }
}
}
