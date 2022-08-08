class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        generateSets(0,candidates,new ArrayList(),res,target);
        return res;
    }
public static void generateSets(int start,int[] arr,List<Integer> current,List<List<Integer>> res,int target){
    if(target==0){
     res.add(new ArrayList(current));
    }
    if(target<0){
      return;
    }
    for(int i=start;i<arr.length;i++){
        current.add(arr[i]);
        generateSets(i,arr,current,res,target-arr[i]);
        current.remove(current.size()-1);
        
    }
}
}
