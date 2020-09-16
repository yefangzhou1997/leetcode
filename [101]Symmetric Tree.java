 public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        else
            return isSymmetric(root.left,root.right);
    }

    private boolean isSymmetric(TreeNode l, TreeNode r) {
        if (l == null && r == null)
            return true;
        if ((l != null && r == null) || (l == null && r != null) || (l.val != r.val))
            return false;
            
        return (isSymmetric(l.left, r.right) && isSymmetric(r.left, l.right));
    }
