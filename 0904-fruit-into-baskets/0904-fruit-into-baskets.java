class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        Map<Integer,Integer> bc = new HashMap<>();
        
        int i=0;
        int mlen=0;
        for(int j=0;j<n;j++){
            bc.put( fruits[j],bc.getOrDefault( fruits[j],0)+1);

            while(bc.size()>2){
                int LF= fruits[i];
                bc.put(LF,bc.get(LF)-1);

                if(bc.get(LF)==0){
                    bc.remove(LF);
                }
                i++;
            }
            int cur = j-i+1;
            mlen=Math.max(mlen,cur);
        }
       return mlen;

    }
}