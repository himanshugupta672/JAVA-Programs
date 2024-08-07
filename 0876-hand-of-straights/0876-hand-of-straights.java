class Pair{
    int val;
    int freq;
    Pair(int val,int freq){
        this.val = val;
        this.freq = freq;
    }
}
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0) return false;
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(Pair p1,Pair p2){
                return Integer.compare(p1.val,p2.val);
            }
        });
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int it: hand){
            hm.put(it, hm.getOrDefault(it,0)+1);
        }
        for(int key: hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }
        while(!pq.isEmpty()){
            Pair card = pq.remove();
            card.freq--;
            Queue<Pair> q = new LinkedList<>();
            for(int i=1;i<groupSize;i++){
                if(!pq.isEmpty() && card.val+i==pq.peek().val){
                    Pair newCard = pq.remove();
                    newCard.freq--;
                    if(newCard.freq>=1){
                        q.add(newCard);
                    } 
                }else{
                    return false;
                }
            }
            while(!q.isEmpty()){
                pq.add(q.remove());
            }
            if(card.freq>=1){
                pq.add(card);
            }
        }
        return true;
    }
}