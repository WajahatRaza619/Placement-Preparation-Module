class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int small=0;
        int large=0;
        int ans=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=k){
            small=Math.min(arr[0]+k,arr[i]-k);
            large=Math.max(arr[n-1]-k,arr[i-1]+k);
            ans=Math.min(large-small,ans);
        }else{
           continue;
        }
        }
        return ans;
    }
}
