class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        List<Integer> list = new ArrayList<>();
        int k=1;
        int c=0; 

        while(n>=0 || k>0 || c>0){
            int digit=k%10;
            int newSum=(n>=0)?digits[n]:0;
            int sum=newSum+k+c;
            list.add(sum%10);
            c=sum/10;
            k=k/10;
            n--;
        }

        Collections.reverse(list);

        int[] arr=new int[list.size()];

        int index=0;
        for(int a:list){
            arr[index++]=a;
        }

        return arr;
    }
}