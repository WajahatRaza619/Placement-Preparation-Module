class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<=n-k;i++){
            max=arr[i];
            for(int j=i+1;j<i+k;j++){
                max=Math.max(arr[j],max);
            }
            list.add(max);
        }
        return list;
    }
}
