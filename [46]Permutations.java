    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> numsList = new ArrayList();
        for (int e : nums) numsList.add(e);
        permutation(res, numsList, 0);
        return res;
    }

    private void permutation(List<List<Integer>> res, List<Integer> numsList, int li) {
        res.add(new ArrayList(numsList));
        for (int i = li; i < numsList.size(); i++) {
            for (int j = i + 1; j < numsList.size(); j++) {
                Collections.swap(numsList, i, j);
                permutation(res, numsList, i + 1);
                Collections.swap(numsList, i, j);
            }
        }
    }
