class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
    List<Integer> list = new ArrayList<>();

    int n = num.length-1;
    int carry=0;

    while(n>=0 ||k>0 ||carry>0){
        int digit=k%10;
        int newSum=(n>=0)?num[n]:0;
        int sum=newSum+digit+carry;
        list.add(sum%10);
        carry=sum/10;
        k=k/10;
        n--;
    }

    Collections.reverse(list);

    return list;
    }
}