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



    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums.length == 0) return res;

        int l = 0, r = nums.length - 1;

        while (l < nums.length) {
            if (nums[l] == target) {
                res[0] = l;
                break;
            }
            l++;
        }

        if (res[0] == -1) return res;

        while (r >= l) {
            if (nums[r] == target) {
                res[1] = r;
                break;
            }
            r--;
        }

        return res;
    }
