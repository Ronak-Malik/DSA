class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            if( nums[i] == 1){
                ones += nums[i];
                ans = Math.max(ans, ones);

            }else{
                ones = 0;
            }
        }

        return ans;
    }
}