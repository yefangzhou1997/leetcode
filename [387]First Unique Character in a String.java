public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) if (!findSameChar(i, s)) return i;
        return -1;
    }

    private boolean findSameChar(int c, String s) {
        for (int i = 0; i < s.length(); i++) if (i != c && s.charAt(i) == s.charAt(c)) return true;
        return false;
    }
