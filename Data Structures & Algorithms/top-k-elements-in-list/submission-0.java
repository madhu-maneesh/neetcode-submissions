class Solution {
    class edge implements Comparator<edge> {
        int v;
        int f;
        public edge(int v,int f){
            this.v=v;
            this.f=f;
        }
        public int compare(edge e,edge q){
            return q.f-e.f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<edge> al=new ArrayList<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet()){
            al.add(new edge(i,hm.get(i)));
        }
        Collections.sort(al,new edge(0,0));
        int res[]=new int[k];
        for(int c=0;c<k;c++){
            edge e=al.get(c);
            res[c]=e.v;
        }
        return res;


    }
}
