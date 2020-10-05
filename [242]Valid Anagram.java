public boolean isAnagram(String s, String t) {

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        if (a.length != b.length) return false;

        int[] x = new int[a.length];
        int[] y = new int[b.length];

        for (int i = 0; i < a.length; i++) {
            x[i] = (int) a[i];
            y[i] = (int) b[i];
        }
        Arrays.sort(x);
        Arrays.sort(y);

        for (int i = 0; i < x.length; i++) {
            if (x[i] != y[i]) return false;
        }

        return true;
        
    }
