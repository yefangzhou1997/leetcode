    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < i) return false;
            max = (nums[i] + i > max) ? nums[i] + i : max;
        }
        return true;
    }
