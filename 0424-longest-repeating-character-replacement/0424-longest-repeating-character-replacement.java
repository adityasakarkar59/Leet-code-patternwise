class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int mlen=0;
        int mfreq=0;
        int j=0;

        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            freq[ch-'A']++;

            mfreq=Math.max(mfreq,freq[ch-'A']);
            while((i-j+1 )-mfreq > k){
                char ch1=s.charAt(j);
                freq[ch1-'A']--;
                j++;
            } 
            mlen=Math.max(mlen,i-j+1);
        }
       return mlen; 
        
    }
}