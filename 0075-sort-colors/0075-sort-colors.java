class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1; // 3 pointers

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swapping arr[low] and arr[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
    

                low++;
                mid++;

            } else if (nums[mid]== 1) {
                mid++;

            } else {
                // swapping arr[mid] and arr[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}