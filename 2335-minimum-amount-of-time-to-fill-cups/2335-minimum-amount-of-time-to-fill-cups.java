class Solution {
    public int fillCups(int[] nums) {
        int ans=0;
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        q.add(nums[0]);
        q.add(nums[1]);
        q.add(nums[2]);

        while(q.peek()!=0){
            int p1= q.poll();
            int p2=q.poll();
            p1--;
            if(p2>0){
                p2--;
            }
            q.add(p1);
            q.add(p2);
            ans++;
        }
        return ans;
    }
}