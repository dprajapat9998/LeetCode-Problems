class Solution {
    public String evaluate(String s, List<List<String>> k) {
        Map<String,String> map=  new HashMap<>();
        for(int i=0;i<k.size();i++){
            map.put(k.get(i).get(0),k.get(i).get(1));
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder ans=new StringBuilder();
        boolean bracket=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                bracket=true;
            }
            else if(s.charAt(i)==')'){
                if(map.containsKey(sb.toString())){
                ans.append(map.get(sb.toString()));
                }else{
                    ans.append("?");
                }
                bracket=false;
                sb.setLength(0);
            }
            else if(bracket){
                sb.append(s.charAt(i));
            }else{
                 ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}