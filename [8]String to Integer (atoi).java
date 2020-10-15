public int myAtoi(String s) {
        if (s.equals("") || s == null) return 0;

        int number = 0;
        int letter = 0;
        int negtivePositive = 0;
        int spaceAfterNumberNegtivePositive = 0;

        String r = new String();

        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);

            if (isLetter(t)) {
                if (number == 0) {
                    return 0;
                }
                letter = 1;
            }

            if (isSpace(t)) {
                if (number == 1 || negtivePositive == 1) {
                    spaceAfterNumberNegtivePositive = 1;
                }
            }

            if (isNegitivePositveSymbol(t)) {
                if (number == 0 && negtivePositive == 0) {
                    r += t;
                    negtivePositive = 1;
                } else if (number == 0 && negtivePositive == 1) {
                    return 0;
                } else if (number == 1) {
                    break;
                }
            }

            if (isNumber(t)) {
                if (letter == 0 && spaceAfterNumberNegtivePositive == 0) {
                    number = 1;
                    r = r + t;
                } else if (letter == 1 && number == 0) {
                    break;
                }
            }
        }//for

        if (number == 0) return 0;

        if (Double.valueOf(r) > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (Double.valueOf(r) < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return Integer.valueOf(r);
        }

    }

    private boolean isNumber(char c) {
        if (c > 47 && c < 58) return true;
        return false;
    }

    private boolean isSpace(char c) {
        if (c == 32) return true;
        return false;
    }

    private boolean isNegitivePositveSymbol(char c) {
        if (c == 45 || c == 43) return true;
        return false;
    }

    private boolean isLetter(char c) {
        if (c > 57 || (c < 48 && c != 45 && c != 43 && c != 32)) return true;
        return false;
    }
