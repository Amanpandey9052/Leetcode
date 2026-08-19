class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> list = new ArrayList<>();

        int i=num.length-1;
        int carry=0;

        while(i>=0 || k>0 || carry>0){
            int digit=k%10;
            int newDigit=(i>=0)?num[i]:0;
            int sum=newDigit+digit+carry;
            list.add(sum%10);
            carry=sum/10;
            k=k/10;
            i--;
        }

        Collections.reverse(list);

        return list;
        
    }
}