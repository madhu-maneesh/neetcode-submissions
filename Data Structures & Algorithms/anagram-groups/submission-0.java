class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> al=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char v[]=s.toCharArray();
            Arrays.sort(v);
            String s1=new String(v);
            if(!hm.containsKey(s1)){
                hm.put(s1,new ArrayList<>());
            }
            hm.get(s1).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
