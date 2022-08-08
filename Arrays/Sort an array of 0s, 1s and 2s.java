class Solution
{
    public static void sort012(int a[], int n)
    {
        int start=0;
        int mid=0;
        int end=a.length-1;
        
        while(mid <= end){
            switch(a[mid]){
                case 0:{
                    int t=a[start];
                    a[start]=a[mid];
                    a[mid]=t;
                    start++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp=a[end];
                    a[end]=a[mid];
                    a[mid]=temp;
                    end--;
                    break;
                }
            }
        }
    }
}
