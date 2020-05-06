class Solution {
    // Boyer–Moore majority vote algorithm
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = -1;
        for (int i: nums) {
            if (count == 0) {
                num = i;
                count++;
            } else {
                count += (i == num) ? 1 : - 1;
            }
        }
        return num;
    }
}
