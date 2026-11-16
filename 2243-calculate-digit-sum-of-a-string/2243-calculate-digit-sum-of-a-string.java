class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(k<sb.length()){
            int count=0;
            int ans=0;
            StringBuilder sb1 = new StringBuilder();
            for(int i=0;i<sb.length();i++){
                ans+=sb.charAt(i)-'0';
                count++;
                if(count==k){
                    sb1.append(String.valueOf(ans));
                    count=0;
                    ans=0;
                }
            }
            if(count!=0){
                sb1.append(String.valueOf(ans));
            }
            sb= sb1;

        }
        return sb.toString();
    }
}