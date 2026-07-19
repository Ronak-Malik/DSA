//use specific version of kadanes algo 

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = totalsum(nums);
        int min = minsum(nums);
        int max = maxsum(nums);
        int cirrmax = cirr(total,min);
        if(max>0){
            return Math.max(max,cirrmax);
        }
        return max;

        
    }
    public int totalsum(int[]nums){
        int sum = 0;
        for(int i=0; i<nums.length ; i++){
            sum += nums[i];
        }
        return sum;
    }
    public int minsum(int[] nums){
        int currmin = nums[0];
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            currmin = Math.min(nums[i],currmin + nums[i]);
            min = Math.min(min,currmin);
        }
        return min;
    }
    public int maxsum(int[] nums){
        int currmax = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            currmax = Math.max(nums[i],currmax + nums[i]);
            max = Math.max(max, currmax);

        }
        return max;
    }
    public int cirr(int totalsum ,int minsum ){
        return totalsum - minsum;
    }
    
}