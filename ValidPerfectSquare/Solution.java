class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            // System.out.println(mid);
            long mul = (long) mid * mid;
            if (mul == num) {
                return true;
            }
            if (mul < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
