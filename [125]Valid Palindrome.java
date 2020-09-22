 public boolean isPalindrome(String s) {
        if (s == null || s == "") return true;

        s = s.toLowerCase();

        char[] c = s.toCharArray();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (((int) c[l] > 47 && (int) c[l] < 58) || ((int) c[l] > 96 && (int) c[l] < 123)) {
                if (((int) c[r] > 47 && (int) c[r] < 58) || ((int) c[r] > 96 && (int) c[r] < 123)) {
                    if (c[l] != c[r]) return false;
                    l++;
                    r--;
                } else {
                    r--;
                }
            } else {
                l++;
            }
            if (l == r) return true;
        }
        return true;
    }
