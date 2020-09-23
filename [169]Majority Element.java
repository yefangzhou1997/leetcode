public int majorityElement(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    temp[j]++;
                    break;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (temp[i] > max) {
                max = temp[i];
                maxIndex = i;
            }
        }
        return nums[maxIndex];
    }

public int majorityElement(int[] nums) {

        int n = nums.length / 2;

        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    temp[j]++;

                    if (temp[j] >= n) {
                        return nums[j];
                    }

                    break;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < nums.length; i++) {

            if (temp[i] >= n) {
                return nums[i];
            }

            if (temp[i] > max) {
                max = temp[i];
                maxIndex = i;
            }
        }
        return nums[maxIndex];
    }
