class Solution {
    public int longestSubarray(int[] nums) {
        int k=0;
        int L=0;
        int max=0;
        for(int R=0;R<nums.length;R++){
            if(nums[R]==0){
                k++;
            }
            while(k>1){
                if(nums[L]==0){
                    k--;
                }
                    L++;
            }
                max=Math.max(max,R-L);

        }
        return max;
    }
}