class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        int k=n-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums,i,j);
                i++;
                j++;
            }else if (nums[j]==1){
                j++;
            }else{
                swap(nums, j, k);
                k--;
            }
        }

        
        
    }
    public static void swap(int[]nums,int n1, int n2){
        int temp = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = temp;
    }
}