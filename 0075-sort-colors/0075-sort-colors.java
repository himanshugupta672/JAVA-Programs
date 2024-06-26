class Solution {
    public void sortColors(int[] nums) {
        int one=0;
        int two=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }else{
                two++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<zero;i++){
            ans.add(0);
        }
        for(int i=0;i<one;i++){
            ans.add(1);
        }
        for(int i=0;i<two;i++){
            ans.add(2);
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = ans.get(i);
        }

    }
}

    /*public static void mergeSort(int[] nums,int l,int r){
         if(l<r){
            int mid = (l+r)/2;

            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);

            merge(nums,l,mid,r);
        }
    }

    public static void merge(int[] arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        for(int i=0;i<n1;i++){
            a1[i] = arr[l+i];
        }

        for(int i=0;i<n2;i++){
            a2[i] = arr[mid+i+1];
        }

        int i=0;
        int j=0;
        int k = l;

        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                arr[k] = a1[i];
                i++;
            }else{
                arr[k] = a2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = a1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = a2[j];
            j++;
            k++;
        }

    }
}*/