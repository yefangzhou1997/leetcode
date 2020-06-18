public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'I') {
                count = count + 1;
            } else if (c[i] == 'V') {
                count = count + 5;
            } else if (c[i] == 'X') {
                count = count + 10;
            } else if (c[i] == 'L') {
                count = count + 50;
            } else if (c[i] == 'C') {
                count = count + 100;
            } else if (c[i] == 'D') {
                count = count + 500;
            } else if (c[i] == 'M') {
                count = count + 1000;
            }
        }//for_1

        for (int i = 0; i < c.length; i++) {
            if (i + 1 < c.length) {
                if (c[i] == 'I' && (c[i + 1] == 'V' || c[i + 1] == 'X')) {
                    count = count - 2;
                }

                if (c[i] == 'X' && (c[i + 1] == 'L' || c[i + 1] == 'C')) {
                    count = count - 20;
                }

                if (c[i] == 'C' && (c[i + 1] == 'D' || c[i + 1] == 'M')) {
                    count = count - 200;
                }

            }
            if (i + 2 < c.length) {
                if (c[i] == 'I' && (c[i + 2] == 'V' || c[i + 2] == 'X')) {
                    count = count - 2;
                }

                if (c[i] == 'X' && (c[i + 2] == 'L' || c[i + 2] == 'C')) {
                    count = count - 20;
                }

                if (c[i] == 'C' && (c[i + 2] == 'D' || c[i + 2] == 'M')) {
                    count = count - 200;
                }

            }
        }//for_2


        return count;
    }//function
