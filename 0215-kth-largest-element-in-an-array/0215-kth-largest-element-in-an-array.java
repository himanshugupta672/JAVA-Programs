class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>  minHeap = new PriorityQueue<>();
		int input[] = nums;
		for(int i=0;i<input.length;i++){
			minHeap.add(input[i]);
			if(minHeap.size()>k){
				minHeap.poll();
			}
		}
        return minHeap.peek();
    }
}