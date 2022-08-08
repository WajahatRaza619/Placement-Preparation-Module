class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<String>();
        int t = 0;
        for(int i = 1; i <= n; i++){
            if(t == target.length) break;  // to stop reading elements after n
            if(i == target[t]){
                ans.add("Push");
                t++;
            }else{
                ans.add("Push");
                ans.add("Pop");
            }
        }
        return ans;
    }
}
