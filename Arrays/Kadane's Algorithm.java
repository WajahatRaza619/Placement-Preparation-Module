class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        int max_sum=arr[0];
        int curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum=curr_sum+arr[i];
            if(curr_sum > max_sum){
                max_sum=curr_sum;
            }
            if(curr_sum < 0){
                curr_sum=0;
            }
        }
        return max_sum;
    }
    
}
