public int maxArea(int[] height) {

        int len = height.length;
        int r = 0;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len; j++) {
                int h = height[i] > height[j] ? height[j] : height[i];
                int a = h * (j - i);
                if (a > r) r = a;
            }
        }
        return r;
    }
