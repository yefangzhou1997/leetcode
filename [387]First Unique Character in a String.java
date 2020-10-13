public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) if (!findSameChar(i, s)) return i;
        return -1;
    }

    private boolean findSameChar(int c, String s) {
        for (int i = 0; i < s.length(); i++) if (i != c && s.charAt(i) == s.charAt(c)) return true;
        return false;
    }

public int firstUniqChar(String s) {
        int[] t = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (t[i] == 1) continue;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    t[i] = 1;
                    t[j] = 1;
                }
            }
            if (t[i] == 0) return i;
        }

        return -1;

    }

public int firstUniqChar(String s) {
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++) c[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++) if (c[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }
