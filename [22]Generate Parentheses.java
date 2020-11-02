    public List<String> generateParenthesis(int n) {
        List<String> r = new ArrayList<String>();
        g(r, n, n, "");
        return r;
    }

    private void g(List<String> l, int left, int right, String s) {
        if (left == 0 && right == 0) {
            l.add(s);
            return;
        }
        if (left > 0) g(l, left - 1, right, s + '(');
        if (right > left) g(l, left, right - 1, s + ')');
    }
