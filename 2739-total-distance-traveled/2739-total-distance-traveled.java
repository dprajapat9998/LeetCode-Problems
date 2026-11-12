class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int ans=0;
        if(mainTank<5) return mainTank*10;
        while(mainTank>=5){
            ans+=50;
            mainTank-=5;
            if(additionalTank>0){
                additionalTank--;
                mainTank++;
            }
        }
        return ans+= mainTank*10;
    }
}