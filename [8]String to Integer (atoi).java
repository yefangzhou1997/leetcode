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
        return c > 47 && c < 58 ? true : false;
    }

    private boolean isSpace(char c) {
        return c == ' ' ? true : false;
    }

    private boolean isSign(char c) {
        return c == '+' || c == '-' ? true : false;
    }

    private boolean isLetter(char c) {
        return c > 57 || (c < 48 && c != '-' && c != '+' && c != ' ') ? true : false;
    }

    private int returnR(String s) {
        double t = Double.valueOf(s);
        if (t >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (t <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int) t;
    }
