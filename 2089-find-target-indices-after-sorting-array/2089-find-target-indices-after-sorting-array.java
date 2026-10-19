class Solution {
    
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int left=0,right=nums.length-1;
        int index=0;
        while(left<=right){
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if(nums[mid]==target){
                index=mid;
                break;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println(index);
        left=index;
        right=index+1;
        while(left>=0){
            if(nums[left]==target){
                list.add(left);
                left--;
            }else{
                break;
            }
        }
        
        while(right<=nums.length-1){
            if(nums[right]==target){
                list.add(right);
                right++;
            }else{
                break;
            }
        }
        Collections.sort(list);
        return list;
    }
}