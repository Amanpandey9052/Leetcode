class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length-1;
        List<Integer> list = new ArrayList<>();
        int carry=1; 

        while(n>=0 ||carry>0){
            int newSum=(n>=0)?digits[n]:0;
            int sum=newSum+carry;
            list.add(sum%10);
            carry=sum/10;
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