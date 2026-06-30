class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }

    private int atMost(int[] nums, int goal) {
        if (goal < 0) {
            return 0;
        }
    
        int count=0;
        int L=0;
        int sum=0;
        for(int R=0;R<nums.length;R++){
            sum+=nums[R];
            
            while(sum>goal && L<=R){
                sum-=nums[L];
                L++;
            }
            count +=(R-L+1);
        }
        return count;
    }
}