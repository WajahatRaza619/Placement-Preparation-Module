class Solution{
    static int toyCount(int N, int K, int arr[])
    {
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<N;i++){
             if(K < arr[i]){
                return count;
            }
            K=K-arr[i];
            count++;
        }
        return count;
    }
}
