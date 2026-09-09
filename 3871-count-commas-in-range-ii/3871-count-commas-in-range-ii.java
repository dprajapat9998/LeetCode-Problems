class Solution {
    public long countCommas(long n) {
        long ans= 0;
        int i=3;
        while(i<=15){
            if(n>=Math.pow(10,i)){
                ans+=n-Math.pow(10,i)+1;
            }
            i+=3;
        }
        return ans;
    }
}