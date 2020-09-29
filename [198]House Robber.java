public int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) return 0;
        else if (len == 1) return nums[0];
        else if (len == 2) return max(nums[0], nums[1]);

        int[] f = new int[len];

        f[0] = nums[0];
        f[1] = max(nums[0], nums[1]);

        for (int i = 2; i < len; i++) {
            f[i] = max(f[i - 1], f[i - 2] + nums[i]);
        }

        return f[len - 1];
    }

    private int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }
