class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        //push to github
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
