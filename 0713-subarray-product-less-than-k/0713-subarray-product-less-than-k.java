class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int i=0;
        int sum=1;
        int count=0;

        for(int j=0;j<nums.length;j++){
            sum *=  nums[j];

            while(sum >= k){
                sum /=nums[i];
                i++;
            }
            count +=j-i+1;
        }
    return count;
        
    }
}