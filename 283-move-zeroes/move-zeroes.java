class Solution {
    public void moveZeroes(int[] nums) {
      int n = nums.length;

      int[] result = new int[n];
      int index = 0;

      for(int i=0; i<n; i++){
        if(nums[i]!=0){
            result[index++] = nums[i];
        }
      }

      for(int i=0; i<n; i++){
        if(nums[i]==0){
            result[index++] = nums[i];
        }
      }

      for(int i =0; i<n; i++){
        nums[i]=result[i];
      }
        
    }
}