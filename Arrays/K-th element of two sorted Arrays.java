class Solution {
    public int kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if(k>n+m)return -1;
       int ans = 0;
       int i=0,j=0;
       while(i<n && j<m && k>0){
           if(arr1[i]<=arr2[j]){
               ans = arr1[i];
               i++;
           }
           else{
               ans = arr2[j];
               j++;
           }
           k--;
       }
       while(k>0 && i<n){
           ans = arr1[i];
           i++;
           k--;
       }
       while(k>0 && j<m){
           ans = arr2[j];
           j++;
           k--;
       }
       return ans;
        
    }
}
