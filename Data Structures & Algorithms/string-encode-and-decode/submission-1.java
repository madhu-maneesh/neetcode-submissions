class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<strs.size();i++){
            sb.append(strs.get(i).length());
             if(i!=strs.size()){
                sb.append("#");
            }
            sb.append(strs.get(i));
        }
            return sb.toString();
    }

    public List<String> decode(String s) {
        int i=0;
        ArrayList<String> al=new ArrayList<>();
        while(i<s.length()){
            int j=i;
           while(s.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(s.substring(i, j));
            j++;
           
            al.add(s.substring(j, j+len));
            i=j+len;
        }
        return al;
    }
}
