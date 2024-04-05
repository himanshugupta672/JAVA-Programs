class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
		boolean inserted = false;
		for(int[] i: intervals){
			if(i[0]>newInterval[0] && !inserted){
				ans.add(newInterval);
				inserted = true;
			}
			ans.add(i);
		}
		if(ans.size()==intervals.length){
			ans.add(newInterval);
		}
		return merge(ans);
    }
    public static int[][] merge(List<int[]> intervals){
		List<int[]> ans = new ArrayList<>();
		int start = intervals.get(0)[0];
		int end = intervals.get(0)[1];
		for(int i=1;i<intervals.size();i++){
			if(intervals.get(i)[0]<=end){
				end = Math.max(end, intervals.get(i)[1]);
			}
			else{
				int arr[] = {start,end};
				ans.add(arr);
				start = intervals.get(i)[0];
				end = intervals.get(i)[1];

			}
		}
		int arr[] = {start,end};
		ans.add(arr);
		int result[][]= new int[intervals.size()][2];
		for(int i=0;i<ans.size();i++){
			result[i][0] = ans.get(i)[0];
			result[i][1] = ans.get(i)[1];
		}
		return ans.toArray(new int[0][]);
	}
}