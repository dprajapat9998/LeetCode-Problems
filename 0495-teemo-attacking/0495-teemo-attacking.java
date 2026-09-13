class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total=0;
        int temp;

        for(int i =0;i<timeSeries.length-1;i++){
            if(timeSeries[i]+duration<timeSeries[i+1]){
                total += duration;
            }
            else{
                temp=timeSeries[i];
                while(temp<timeSeries[i+1]){
                total++;
                temp++; 
                }
            }
        }
        total += duration;
        return total;
    }
}