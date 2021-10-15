/* The isBadVersion API is defined in the parent class VersionControl.
      def isBadVersion(version: Int): Boolean = {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var min = 1
        var max = n
        while (min < max) {
            var mid = min + (max - min) / 2;
            if (isBadVersion(mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        return min;
	    }
}