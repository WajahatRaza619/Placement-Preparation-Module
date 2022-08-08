public static int[] calculateSpan(int price[], int n)
    {
        int b[]=new int[n];
        b[0]=1;
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && price[i]>=price[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                b[i]=i+1;
            }else{
                b[i]=i-st.peek();
            }
            st.push(i);
        }
        return b;
    }
}
