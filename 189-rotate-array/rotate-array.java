class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k % n;

        int[] result = new int[n];
        int index = 0;

        for(int i=n-k;i<n;i++){
            result[index++]=nums[i];
        }
        for(int i = 0; i<n-k; i++){
            result[index++]=nums[i];
        }

        for(int i = 0; i<n; i++){
            nums[i] = result[i];

        }
        //In the first two loops, we need two different pointers because we are reading from one place but writing to another. In the final loop, we only need one pointer because we are moving strictly parallel from index 0 to the end.

        
    }
}