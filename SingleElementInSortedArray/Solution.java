class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, m = 0;
        int r = nums.length - 1;
        while (l < r) {
            m = l + (r - l) / 2;
            if (m % 2 == 0) {
                if (nums[m + 1] != nums[m]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m + 1] == nums[m]) {
                    r = m;
                } else {
                    l = m + 1;
                }
            }
        }
        return nums[l];
    }
}
