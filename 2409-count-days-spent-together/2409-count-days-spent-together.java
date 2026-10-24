class Solution {
    public int findDayofYear(String s,int[] arr){
        int month = Integer.valueOf(s.substring(0,2));
        int date =Integer.valueOf(s.substring(3));

        return arr[month-1]+date;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
         int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         int[] cumulativesum = new int[13];
         cumulativesum[1]=31;
         for(int i=2;i<=12;i++){
            cumulativesum[i]=cumulativesum[i-1]+days[i-1];
         }

         int aliceatime=findDayofYear(arriveAlice,cumulativesum);
         int aliceltime=findDayofYear(leaveAlice,cumulativesum);
         int bobatime=findDayofYear(arriveBob,cumulativesum);
         int bobltime=findDayofYear(leaveBob,cumulativesum);

         int ans = Math.min(aliceltime,bobltime) - Math.max(aliceatime,bobatime);

         return ans>=0 ? ans+1 :0;

    }
}