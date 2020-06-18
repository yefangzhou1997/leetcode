public int lengthOfLastWord(String s) {

        if (s.equals("")) {
            return 0;
        } else if (s.equals(" ")) {
            return 0;
        }

        char[] c = s.toCharArray();
        int indexOfLastSpace = -1;
        int indexOfLastNonSpace = -1;

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                indexOfLastSpace = i;
            } else {
                indexOfLastNonSpace = i;
            }
        }

        if (indexOfLastSpace == -1) {
            return s.length();
        } else if (indexOfLastSpace == s.length() - 1) {
            if (indexOfLastNonSpace == -1) {
                return 0;
            } else {
                int limit = indexOfLastNonSpace + 1;
                indexOfLastSpace = -1;
                indexOfLastNonSpace = -1;
                for (int i = 0; i < limit; i++) {
                    if (c[i] == ' ') {
                        indexOfLastSpace = i;
                    } else {
                        indexOfLastNonSpace = i;
                    }
                }
                return limit - indexOfLastSpace - 1;
            }

        } else {
            return s.length() - indexOfLastSpace - 1;
        }


    }
