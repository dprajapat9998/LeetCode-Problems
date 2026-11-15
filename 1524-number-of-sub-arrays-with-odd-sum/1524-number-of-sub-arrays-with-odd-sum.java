class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        int even=1;
        int odd=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
        if(prefix[i]%2!=0){
            sum=(sum+even)%MOD;
            odd++;
        }else{
            sum=(odd+sum)%MOD;
            even++;
        }
        }
        return sum;
    }
}