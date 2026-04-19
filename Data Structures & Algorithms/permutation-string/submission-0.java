class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int f1[]=new int[26];
        int f2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)-'a']++;
        }
        int l=0;
        for(int i=0;i<s2.length();i++){
            char c=s2.charAt(i);
            f2[c-'a']++;
            while(i-l+1>s1.length()){
                f2[s2.charAt(l++)-'a']--;
            }
            if(Arrays.equals(f1,f2)){
                return true;
            }
        }
        return false;
    }
}
