public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            move(nums);
        }
    }

    private void move(int[] nums) {
        int len = nums.length - 1;
        int temp = nums[len];
        for (int i = len; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }
