class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            // List < String> list = item.get(i);
            List<String> list = items.get(i);
                if(ruleKey.equals("color")){
                    if(ruleValue.equals(list.get(1))){
                        count++;
                    }
                }
            else    if(ruleKey.equals("type")){
                    if(ruleValue.equals(list.get(0))){
                        count++;
                    }
                }
                else{
                                
                    if(ruleValue.equals(list.get(2))){
                        count++;
                    }
                }
        }
         return count;   
    }
}