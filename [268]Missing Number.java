public int missingNumber(int[] nums) {
        int n = nums.length;
        int r = 0;
        for (int i = 0; i < n; i++) {
            r ^= i;
            r ^= nums[i];
        }
        return r ^= n;
    }
