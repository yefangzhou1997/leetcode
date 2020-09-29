public int hammingWeight(int n) {
        int r = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) r++;
            n = n >> 1;
        }
        return r;
    }
