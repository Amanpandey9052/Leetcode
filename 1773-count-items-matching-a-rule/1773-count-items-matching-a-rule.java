// class Solution {
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//         int count=0;
//         if(ruleKey.equals("type")){
//             count = search(items,0,ruleValue);
//         }else if(ruleKey.equals("color")){
//             count=search(items,1,ruleValue);
//         }else{
//             count=search(items,2,ruleValue);
//         }
//         return count;
//     }

//     int search(List<List<String>> items,int column,String target){
//         int count =0;
//         for(int i=0;i<items.size();i++){
//             if(items.get(i).get(column).equals(target)){
//                 count++;
//             }      
//         }
//         return count;
//     }
// }

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int res = 0;
        
        for(int i = 0 ;i<items.size();i++){
            if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
            if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
            if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;
        }
        
        return res;
        
    }
}

