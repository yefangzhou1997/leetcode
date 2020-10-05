 public boolean isAnagram(String s, String t) {
        int len = s.length();
        if (len != t.length()) return false;

        char[] x = s.toCharArray();
        char[] y = t.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        for (int i = 0; i < len; i++) if (x[i] != y[i]) return false;

        return true;
    }
