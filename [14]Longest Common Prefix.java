public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        char[] prefix = strs[0].toCharArray();

        for (int i = 1; i < strs.length; i++) {
            int count = 0;
            char[] c = strs[i].toCharArray();

            for (int j = 0; j < prefix.length && j < c.length; j++) {


                if (c[j] == prefix[j]) {
                    count = count + 1;
                } else {
                    break;
                }
            }

            if (count == 0) {
                return "";
            }

            String temp = new String(prefix);


            prefix = temp.substring(0, count).toCharArray();


        }
        return new String(prefix);
    }
