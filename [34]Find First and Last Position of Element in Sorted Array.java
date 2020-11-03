public int[] searchRange(int[] nums, int target) {
        int[] r = {-1, -1};
        if (nums.length == 0) return r;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                r[0] = i;
                break;
            }
        }

        if (r[0] != -1) {
            for (int i = r[0]; i < nums.length; i++) {
                if (nums[i] != target) {
                    r[1] = i - 1;
                    break;
                }
            }
            if (nums[nums.length - 1] == target) r[1] = nums.length - 1;
        }
        return r;
    }
