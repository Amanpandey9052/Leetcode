class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        if(ruleKey.equals("type")){
            count = search(items,0,1,ruleValue);
        }else if(ruleKey.equals("color")){
            count=search(items,1,2,ruleValue);
        }else{
            count=search(items,2,3,ruleValue);
        }
        return count;
    }

    int search(List<List<String>> items,int column,int columnSize,String target){
        int count =0;
        for(int i=0;i<items.size();i++){
            for(int j=column;j<columnSize;j++){
                if(items.get(i).get(j).equals(target)){
                    count++;
                }
            }
        }
        return count;
    }
}