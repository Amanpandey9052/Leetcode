class Solution {
    public int[] sumZero(int n) {
        // int[] arr=new int[n];
        // int value= -(n/2);
        // for(int i=0;i<n;i++){
        //     if(n%2==0){
        //         if(i<n/2){
        //             arr[i]=value++;
        //         }else{
        //             arr[i]=-arr[n-1-i];
        //         }
        //     }else{
        //         arr[i]=value++;
        //     }
        // }
        // return arr;

        int[] arr=new int[n];

        int index=0;
        for(int i=1;i<=n/2;i++){
            arr[index++]=i;
            arr[index++]=-i;
        }

        if(n%2!=0){
            arr[index]=0;
        }

        return arr;
    }
}