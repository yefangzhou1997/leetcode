    public String longestPalindrome(String s) {

        if (s == null) return null;

        int len = s.length();
        int sublen = len;

        for (int i = sublen; i > 0; i--) {
            for (int j = 0; j < len - i + 1; j++) {
                String temp = s.substring(j, j + i - 1) + s.charAt(j + i - 1);
                if (isPalindrome(temp)) return temp;
            }
        }

        return s.substring(0, 1);
    }

    private boolean isPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
