class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,longest=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(hs.contains(c)){
                hs.remove(s.charAt(l++));
            }
            longest=Math.max(longest,i-l+1);
            hs.add(c);
        }
        return longest;
    }
}
