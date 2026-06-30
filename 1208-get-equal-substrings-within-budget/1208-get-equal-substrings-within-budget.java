class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int [] arr=new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            arr[i]=Math.abs(s.charAt(i)-t.charAt(i));
        }
        int L=0;
        int sum=0;
        int len=0;
        for(int R=0;R<arr.length;R++){
            sum+=arr[R];

            while(sum > maxCost){
                sum -=arr[L];
                L++;
            }
            len=Math.max(len,R-L+1);
        }
       return len; 
    }
}