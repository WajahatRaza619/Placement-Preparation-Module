public static void main(String args[])
	{
		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
		    out.println(new Solution().findLongestConseqSubseq(a, n));
		    t--;
		}
		out.flush();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	    if(N==1){
	        return 1;
	    }
	    int count=1;
	    int ans=0;
	   Arrays.sort(arr);
	   for(int i=1;i<N;i++){
	       if(arr[i]==arr[i-1]){
	           continue;
	       }
	       if(arr[i]==arr[i-1]+1){
	           count++;
	       }else{
	           count=1;
	       }
	       ans=Math.max(ans,count);
	   }
	   return ans;
	}
}
