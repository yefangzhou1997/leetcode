public int titleToNumber(String s) {
        int total = 0;
        int len = s.length() - 1;
        for (int i = 0; i <= len; i++) {
            total += ((int) s.charAt(i) - 64) * Math.pow(26, len - i);
        }
        return total;
    }
