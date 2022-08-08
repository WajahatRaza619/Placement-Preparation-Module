class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer>lt = new ArrayList<>();
       HashMap<Integer,Integer>map = new HashMap<>();
       int i=0;
       while(i<=k-2)
       {
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
           i++;
       }
       i--;
       int j = -1;
       while(i<n-1){
           i++;
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);  
           lt.add(map.size());
           j++;
           int fre = map.get(arr[j]);
           if(fre==1){
               map.remove(arr[j]);
           }else{
               map.put(arr[j],map.get(arr[j])-1);
           }
       }
       return lt;
    }
}

