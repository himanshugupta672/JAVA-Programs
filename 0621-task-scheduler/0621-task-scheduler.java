class Pair{
    int time;
    int count;
    Pair(int time,int count){
        this.time = time;
        this.count = count;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new 
        Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                return -Integer.compare(p1.count,p2.count);
            }
        });
        int time=0;
        int fq[] = new int[26];
        for(char ch: tasks){
            fq[ch-'A']++;
        }
        for(int i=0;i<26;i++){
            if(fq[i]>=1){
                pq.add(new Pair(0,fq[i]));
            }
        }
        Queue<Pair> q = new LinkedList<>();
        while(!pq.isEmpty() || !q.isEmpty()){
            if(!q.isEmpty() && (time-q.peek().time)>n){
                pq.add(q.remove());
            }

            if(!pq.isEmpty()){
                Pair p1 = pq.remove();
                p1.count--;
                p1.time = time;
                if(p1.count>0){
                q.add(p1);
                }
            }
            time++;
        }
        return time;
    }
}