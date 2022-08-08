class Solution {
    public boolean canPair(int[] nums, int k) {
        
       HashMap<Integer,Integer> hs = new HashMap<>();
       
       if(nums.length%2 !=0)
       return false;
       
       int count =0;
       for(int a:nums){
           
           int b= a%k;
           int c = k-b;
           if(b==0)
           c=0;
           
           
           if(hs.containsKey(c)){
               
              if(hs.get(c)==1)
              hs.remove(c);
              else{
                  hs.put(c,hs.get(c)-1);
              }
               count++;
               
           }
           
           else{
               
           if(hs.containsKey(b))
           hs.put(b,hs.get(b)+1);
           else
           hs.put(b,1);
               
           }
       }
       
       if(count==nums.length/2)
       return true;
       
       return false;
   }
}
