class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> result = new ArrayList<Integer>();

        int n=num.length-1;
        int c=0;

        while(n>=0 || k>0 || c>0){
            int digit=k%10;
            int newSum=(n>=0)?num[n]:0;
            int sum=newSum+digit+c;
            result.add(sum%10);
            c=sum/10;
            k=k/10;
            n--;
        }

        Collections.reverse(result);

        return result;
    }
}