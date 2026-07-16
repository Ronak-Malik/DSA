class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxPro = nums[0];

        for(int i=1; i<nums.length; i++){
            int temp = currMax;

            currMax = Math.max(nums[i], Math.max(temp*nums[i],currMin*nums[i]));

            currMin = Math.min(nums[i], Math.min(temp*nums[i],currMin*nums[i]));

            maxPro = Math.max(maxPro, currMax);
        }
        return maxPro;
    }
}