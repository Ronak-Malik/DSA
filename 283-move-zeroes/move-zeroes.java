class Solution {
    public void moveZeroes(int[] nums) {
     int n = nums.length;

     move(nums, 0);
        
    }

    public static void move(int[] nums, int left){
       for (int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                swap(nums,left,right);
                left++;
                
            }

        }
    }

    public static void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}