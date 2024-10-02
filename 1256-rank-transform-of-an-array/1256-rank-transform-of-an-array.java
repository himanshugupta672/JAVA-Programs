class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int temp[] = arr.clone();
        Arrays.sort(temp);
        int rank=1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(temp[i])){
                hm.put(temp[i],rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}