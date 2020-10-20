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

public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, r = 0;

        while (true) {
            if (i == j) break;
            int t = (j - i) * (height[i] <= height[j] ? height[i++] : height[j--]);
            if (r < t) r = t;
        }
        return r;
    }
