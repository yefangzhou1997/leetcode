    public String longestPalindrome(String s) {
        
        int len = s.length();
        int sublen = len;

        for (int i = sublen; i > 0; i--) {
            for (int j = 0; j < len - i + 1; j++) {
                String temp = s.substring(j, j + i);
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



    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int l = i, r = i;
            while (l >= 0 && s.charAt(l) == c) l--;
            while (r < s.length() && s.charAt(r) == c) r++;

            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) != s.charAt(r)) break;
                l--;
                r++;
            }

            String t = s.substring(l + 1, r);
            res = t.length() > res.length() ? t : res;

        }
        return res;
    }
