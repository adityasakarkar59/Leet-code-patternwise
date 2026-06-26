class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        int n = nums.length;
        int i=0;
        int  HL=0;

        HashMap<Integer,Integer> bc = new HashMap<>();
        for(int j=0;j<n;j++){
           bc.put(nums[j],bc.getOrDefault(nums[j],0)+1);
        
        while(bc.get(nums[j]) > k){
            bc.put(nums[i],bc.get(nums[i])-1);
            i++;
        }
     HL=Math.max(HL,j-i+1);

        }
        return HL;
        
    }
}