class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(k<sb.length()){
            ArrayList<Integer> list = new ArrayList<>();
            int count=0;
            int ans=0;
            for(int i=0;i<sb.length();i++){
                ans+=sb.charAt(i)-'0';
                count++;
                if(count==k){
                    list.add(ans);
                    count=0;
                    ans=0;
                }
            }
            if(count!=0){
                list.add(ans);
            }
            sb= new StringBuilder();
            for(int i=0;i<list.size();i++){
                sb.append(String.valueOf(list.get(i)));
            }

        }
        return sb.toString();
    }
}