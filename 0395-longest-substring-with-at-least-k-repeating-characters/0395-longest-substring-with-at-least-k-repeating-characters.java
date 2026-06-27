class Solution {
    public int longestSubstring(String s, int k) {
        int maxlen=0;
        for(int i=0;i<=26;i++){
            int []freq = new int[26];

            int L=0;
            int uniq=0;
            int chc=0;
             
            for(int R=0;R<s.length();R++){
                int RI = s.charAt(R)-'a';

                if(freq[RI]==0){
                    uniq++;
                }
                freq[RI]++;

                if(freq[RI]==k){
                    chc++;
                }
                while(uniq > i){
                    int LI = s.charAt(L)-'a';
                    if(freq[LI]==k){
                        chc--;
                    }
                    freq[LI]--;

                    if(freq[LI]==0){
                        uniq--;

                    }
                    L++;
                }
                if(uniq==i && chc==i){
                    maxlen=Math.max(maxlen,R-L+1);
                }

            }
}
 return maxlen;
        
    }
}