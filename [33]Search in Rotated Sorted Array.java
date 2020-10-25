    public int search(int[] nums, int target) {

        int len = nums.length;
        if (len == 1 && nums[0] == target) return 0;

        int left = 0, right = len - 1, mid = -1;

        while (left < right) {
            mid = (left + right) / 2;
            if (nums[left] == target) return left;
            if (nums[right] == target) return right;
            if (nums[mid] == target) return mid;

            if (nums[mid] > nums[left]) {
                if (target > nums[mid]) left = mid + 1;
                else {
                    if (target < nums[left]) left = mid + 1;
                    else right = mid - 1;
                }
            } else {
                if (target < nums[mid]) right = mid - 1;
                else {
                    if (target < nums[right]) left = mid + 1;
                    else right = mid - 1;
                }
            }
        }
        return -1;
    }
