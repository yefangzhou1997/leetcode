public int countPrimes(int n) {
        int r = 0;
        for (int i = 2; i < n; i++) if (isPrime(i)) r++;
        return r;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

public int countPrimes(int n) {
        int r = 0;
        boolean[] a = new boolean[n + 1];

        for (int i = 2; i < n; i++) {
            if (!a[i]) {
                for (int j = i + i; j < n; j += i) a[j] = true;
                r++;
            }
        }
        return r;
    }
