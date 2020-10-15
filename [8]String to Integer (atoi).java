public int myAtoi(String s) {
        if (s.equals("")) return 0;

        int number = 0, sign = 0;
        String r = new String();

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);

            if (isLetter(t)) {
                if (number == 0) return 0;
                if (number == 1) break;
            }

            if (isSpace(t)) if (number == 1 || sign == 1) break;

            if (isSign(t)) {
                if (number == 0 && sign == 0) {
                    r += t;
                    sign = 1;
                }
                else if (number == 0 && sign == 1) return 0;
                else if (number == 1) break;
            }

            if (isNumber(t)) {
                    number = 1;
                    r += t;
            }

        }//for
        if (number == 0) return 0;
        return returnR(r);
    }

    private boolean isNumber(char c) {
        if (c > 47 && c < 58) return true;
        return false;
    }

    private boolean isSpace(char c) {
        if (c == 32) return true;
        return false;
    }

    private boolean isSign(char c) {
        if (c == 45 || c == 43) return true;
        return false;
    }

    private boolean isLetter(char c) {
        if (c > 57 || (c < 48 && c != 45 && c != 43 && c != 32)) return true;
        return false;
    }

    private int returnR(String s) {
        if (Double.valueOf(s) >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (Double.valueOf(s) <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return Integer.valueOf(s);
    }
