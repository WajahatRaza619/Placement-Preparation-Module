class Solution {
    //Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int i=0;i<arr.size();i=i+k){
            int l=i;
            int r=Math.min(i+k-1,arr.size()-1);
            reverse(arr,l,r);
        }
    }
public static void reverse(ArrayList<Integer> list,int l,int r){
    while(l<r){
        int temp=list.get(l);
        list.set(l,list.get(r));
        list.set(r,temp);
        l++;
        r--;
        
    }
}
