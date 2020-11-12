    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix.length == 0) return res;
        
        int left = 0, right = matrix[0].length - 1, top = 0, down = matrix.length - 1;

        while (true) {
            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
            if (++top > down) break;
            for (int i = top; i <= down; i++) res.add(matrix[i][right]);
            if (--right < left) break;
            for (int i = right; i >= left; i--) res.add(matrix[down][i]);
            if (--down < top) break;
            for (int i = down; i >= top; i--) res.add(matrix[i][left]);
            if (++left > right) break;
        }
        return res;
    }
