public int strStr(String haystack, String needle) {

        if (haystack.equals(needle)) {
            return 0;
        }

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();


        for (int i = 0; i < h.length - n.length + 1; i++) {
            int v = 1;
            for (int j = 0; j < n.length; j++) {
                if (h[i + j] != n[j]) {
                    v = 0;
                }
            }
            if (v == 1) {
                return i;
            }
        }
        return -1;
    }
