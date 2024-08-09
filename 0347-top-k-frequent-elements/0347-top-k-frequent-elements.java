class Pair{
    int num;
    int freq;
    Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(Pair p1,Pair p2){
                return Integer.compare(p1.freq,p2.freq);
            }
        });
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i: hm.keySet()){
            Pair p = new Pair(i,hm.get(i));
            if(pq.size()<k){
                pq.add(p);
            }else if(hm.get(i)>pq.peek().freq){
                pq.remove();
                pq.add(new Pair(i,hm.get(i)));
            }
        }
        int ans[] = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i] = pq.remove().num;
            i++;
        }
        return ans;
    }
}