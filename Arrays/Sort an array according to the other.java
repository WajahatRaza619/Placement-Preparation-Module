class Solution{
    // A1[] : the input array-1
    // N : size of the array A1[]
    // A2[] : the input array-2
    // M : size of the array A2[]
    
    //Function to sort an array according to the other array.
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M)
    {
        HashMap<Integer,Integer>fm=new HashMap<>();
       for(int num:A1){
           if(fm.containsKey(num)){
               fm.put(num,fm.get(num)+1);
           }else{
               fm.put(num,1);
           }
       }
       int j=0;
       int arr[]=new int[A1.length];
       for(int i=0;i<A2.length;i++){
           if(fm.containsKey(A2[i])){
               int freq=fm.get(A2[i]);
               while(freq>0){
                   arr[j++]=A2[i];
                   freq--;
               }
               fm.remove(A2[i]);
           }
       }
       ArrayList<Integer> list=new ArrayList<>();
       for(int num:fm.keySet()){
           int count=0;
           while(count < fm.get(num)){
               list.add(num);
               count++;
           }
       }
       Collections.sort(list);
       for(int i=0;i<list.size();i++){
           arr[j++]=list.get(i);
       }
       return arr;
    }
}



// { Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}


  // } Driver Code Ends
