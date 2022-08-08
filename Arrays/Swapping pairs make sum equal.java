long findSwapValues(long A[], int n, long  B[], int m)
    {
        long s1=0, s2=0;
       Set<Long> aux=new HashSet<Long>();
       for(int i=0; i<m; i++)
           aux.add(B[i]);
       for(int i=0; i<n; i++)
           s1+=A[i];
       for(int i=0; i<m; i++)
           s2+=B[i];
       for(int i=0; i<n; i++)
           if((s2-s1+2*A[i])%2==0 && aux.contains((s2-s1+2*A[i])/2))
               return 1;
       return -1;
    }
}
