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
