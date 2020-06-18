public static double myPow(double x, int n) {

        if (x == 1) {
            return 1;
        } else if (x == -1) {
            if (n % 2 == 0) {
                return 1;
            } else {
                return -1;
            }

        }

        if (n == 0) {
            return 1;
        } else if (n == 2147483647 && x > 1) {
            return Double.POSITIVE_INFINITY;
        } else if (n == 2147483647 && x < 1 && x > 0) {
            return 0;
        } else if (n > 0) {
            double a = 1;
            for (int i = 0; i < n; i++) {
                a = a * x;
            }
            return a;
        } else {
            if (n != -2147483648) {
                n = n * -1;
                double a = 1;
                for (int i = 0; i < n; i++) {
                    a = a * x;
                }
                return 1 / a;
            } else {
                return 0;
            }

        }
    }
