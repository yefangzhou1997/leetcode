public int trailingZeroes(int n) {
        int ct = 0;
        while (n != 0) {
            ct += n / 5;
            n = n / 5;
        }
        return ct;
    }
