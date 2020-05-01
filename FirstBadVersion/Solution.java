/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid = 1; // if n == 1 return 1
        while (low < high) {
            //mid = (low + high) / 2; // overflow!
            mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid;
            }
            if (high - low == 1) {
                if (isBadVersion(low)) {
                    return low;
                } else {
                    return high;
                }
            }
        }
        return mid;
    }
}
