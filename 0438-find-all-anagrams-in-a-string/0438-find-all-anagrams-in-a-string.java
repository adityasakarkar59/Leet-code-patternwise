class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int wins=p.length();
        if(wins > s.length()){
            return res;
        }

        int [] s1=new int[26];
        int [] freq=new int[26];
        for(int i=0;i<wins;i++){
            s1[p.charAt(i)-'a']++;
            freq[s.charAt(i)-'a']++;
        }
        if (Arrays.equals(s1, freq)) {
            res.add(0);
        }



for(int j=wins;j<s.length();j++){
            freq[s.charAt(j)-'a']++;
            freq[s.charAt(j-wins)-'a']--;
            if(Arrays.equals(s1,freq))
            res.add(j-wins+1);
        }


        return res;
    }
}