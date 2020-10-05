public int missingNumber(int[] nums) {
        int n = nums.length;
        int r = 0;
        for (int i = 0; i < n; i++) {
            r ^= i;
            r ^= nums[i];
        }
        return r ^= n;
    }

public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) if (nums[i] != i) return i;
        return n;
    }
