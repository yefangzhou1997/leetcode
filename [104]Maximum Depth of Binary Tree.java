public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        } else
            return max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    private int max(int a, int b) {
        if (a >= b)
            return a;
        else
            return b;
    }
