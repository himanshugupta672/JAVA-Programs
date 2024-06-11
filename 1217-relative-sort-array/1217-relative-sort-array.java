class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr1[i])){
                hm.put(arr1[i],hm.get(arr1[i])+1);
            }else{
                hm.put(arr1[i],1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            if(hm.containsKey(arr2[i])){
                while(hm.get(arr2[i])!=0){
                    ans.add(arr2[i]);
                    hm.put(arr2[i],hm.get(arr2[i])-1);
                }
                hm.remove(arr2[i]);
            }
        }
        ArrayList<Integer> rem = new ArrayList<>();
        for(int key: hm.keySet()){
            while(hm.get(key)!=0){
                rem.add(key);
                hm.put(key,hm.get(key)-1);
            }
        }

        Collections.sort(rem);
        for(int i=0;i<rem.size();i++){
            ans.add(rem.get(i));
        }
        
        int res[] = new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i] = ans.get(i);
        }

        return res;
        

    }
}