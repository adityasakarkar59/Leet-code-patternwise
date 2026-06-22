class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int min=Integer.MAX_VALUE;
        int sum=0;

        for(int j=0;j<n;j++){
            sum +=nums[j];

            while(sum >= target){
                int cur = j-i+1;
                min = Math.min(min,cur);
                sum -=nums[i];
                i++;
            }
        }
        return (min==Integer.MAX_VALUE) ? 0:min;
        
    }
}