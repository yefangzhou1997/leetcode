    public List<List<Integer>> generate(int numRows) {

        if (numRows == 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> T = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        T.add(temp);
        if (numRows == 1) {
            return T;
        }

        List<Integer> temp2 = new ArrayList<>();
        temp2.add(1);
        temp2.add(1);
        T.add(temp2);
        if (numRows == 2) {
            return T;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> t = new ArrayList<>();
            t.add(1);
            for (int j = 0; j < T.get(i - 1).size() - 1; j++) {

                t.add(T.get(i - 1).get(j) + T.get(i - 1).get(j + 1));
            }
            t.add(1);
            T.add(t);

        }
        return T;
    }
