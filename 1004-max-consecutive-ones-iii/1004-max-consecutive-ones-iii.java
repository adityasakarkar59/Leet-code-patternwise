class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int zero=0;
        int mlen=0;

        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) {
                zero++;
            }
            while(zero > k){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            int cur = j-i+1;
            mlen=Math.max(mlen,cur);
        }


        return mlen;
    }
}