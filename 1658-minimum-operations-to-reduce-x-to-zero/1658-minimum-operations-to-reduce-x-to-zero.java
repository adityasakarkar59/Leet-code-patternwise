class Solution {
    public int minOperations(int[] nums, int x) {
        int op=0;
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum+=nums[i];
        }

        int k=tsum-x;
        if(k <  0) {
            return -1;
        }
        if(k==0) return nums.length;

    
        int L=0;
        int sum=0;
        int max=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>k && L <= i){
                sum-=nums[L];
                L++;
            }
            if(sum==k){
            max=Math.max(max,i-L+1);
            }
        }
        if(max==-1){
            return -1;
        }
            return nums.length-max;
    }
}