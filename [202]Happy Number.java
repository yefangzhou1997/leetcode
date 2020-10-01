public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do {
            s = happySqt(s);
            f = happySqt(happySqt(f));
        } while (f != s);
        if (f == 1) return true;
        else return false;
    }

    private static int happySqt(int n) {
        int r = 0;
        while (n != 0) {
            r += (n % 10) * (n % 10);
            n = n / 10;
        }
        return r;
    }
