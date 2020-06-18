public static String addBinary(String a, String b) {

        if (a.equals("0") && b.equals("0")) {
            return "0";
        }

        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();

        int shortLength;
        int longLength;

        char[] temp;
        char[] result;


        if (ac.length > bc.length) {
            shortLength = bc.length;
            longLength = ac.length;

            temp = new char[longLength];
            for (int i = 0; i < shortLength; i++) {
                temp[longLength - i - 1] = bc[shortLength - i - 1];
            }
            for (int i = shortLength; i < longLength; i++) {
                temp[longLength - i - 1] = '0';
            }

            bc = temp;
            result = new char[longLength + 1];

        } else {
            shortLength = ac.length;
            longLength = bc.length;

            temp = new char[longLength];
            for (int i = 0; i < shortLength; i++) {
                temp[longLength - i - 1] = ac[shortLength - i - 1];
            }
            for (int i = shortLength; i < longLength; i++) {
                temp[longLength - i - 1] = '0';
            }

            ac = temp;
            result = new char[longLength + 1];

        }


        int plus = 0;

        for (int i = 0; i < longLength; i++) {
            if (ac[ac.length - i - 1] == '1' && bc[bc.length - i - 1] == '1' && plus == 0) {
                result[longLength - i] = '0';
                plus = 1;
            } else if (ac[ac.length - i - 1] == '1' && bc[bc.length - i - 1] == '1' && plus == 1) {
                result[longLength - i] = '1';
                plus = 1;
            } else if (ac[ac.length - i - 1] == '1' && bc[bc.length - i - 1] == '0' && plus == 0) {
                result[longLength - i] = '1';
                plus = 0;
            } else if (ac[ac.length - i - 1] == '1' && bc[bc.length - i - 1] == '0' && plus == 1) {
                result[longLength - i] = '0';
                plus = 1;
            } else if (ac[ac.length - i - 1] == '0' && bc[bc.length - i - 1] == '1' && plus == 0) {
                result[longLength - i] = '1';
                plus = 0;
            } else if (ac[ac.length - i - 1] == '0' && bc[bc.length - i - 1] == '1' && plus == 1) {
                result[longLength - i] = '0';
                plus = 1;
            } else if (ac[ac.length - i - 1] == '0' && bc[bc.length - i - 1] == '0' && plus == 0) {
                result[longLength - i] = '0';
                plus = 0;
            } else if (ac[ac.length - i - 1] == '0' && bc[bc.length - i - 1] == '0' && plus == 1) {
                result[longLength - i] = '1';
                plus = 0;
            }


        }//for


        if (plus == 1) {
            result[0] = '1';
        } else {
            return new String(result).substring(1, longLength + 1);
        }

        return new String(result);
    }
