class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int value = -(n/2);
        int a=1;
        for(int i=0;i<n;i++){
            //even
            if(n%2==0){
                if(i<n/2)
                    arr[i]= value++;
                else
                    arr[i]=-arr[n-1-i];
            }else{
                arr[i]=value++;
            }
        }
        return arr;
    }
}