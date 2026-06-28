class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int wins=s1.length();
        if (wins > s2.length()) {
            return false;
        }

        int [] S1=new int[26];
        int [] S2=new int[26];
        
        for(int i=0;i<wins;i++){
            S1[s1.charAt(i)-'a']++;
            S2[s2.charAt(i)-'a']++;
        }
            if(Arrays.equals(S1,S2)) {
                return true;
            }
        for(int j=wins;j<s2.length();j++){
                S2[s2.charAt(j)-'a']++;
                S2[s2.charAt(j-wins)-'a']--;
                if(Arrays.equals(S1,S2)){
                    return true;
                }
        }

        
        return false;
    }
}