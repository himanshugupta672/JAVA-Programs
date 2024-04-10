class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Stack<Integer> stack = new Stack();
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(nums2[m-1],-1);
        stack.push(nums2[m-1]);
        for(int i= m-2;i>=0;i--){

            if(nums2[i]<stack.peek()){
                hm.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
                continue;
            }
            while(!stack.isEmpty() && stack.peek()<= nums2[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                hm.put(nums2[i],-1);
                stack.push(nums2[i]);
            }
            else{
                hm.put(nums2[i],stack.peek());
                stack.push(nums2[i]);
            }
        }

        for(int i=0;i<n;i++){
            nums1[i] = hm.get(nums1[i]);
        }
        return nums1;
    }
}