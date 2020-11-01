  public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            ArrayList<Character> temp = new ArrayList<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') temp.add(board[i][j]);
            }
            if (!checkOK(temp)) return false;
        }

        for (int i = 0; i < 9; i++) {
            ArrayList<Character> temp = new ArrayList<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') temp.add(board[j][i]);
            }
            if (!checkOK(temp)) return false;
        }

        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                ArrayList<Character> temp = new ArrayList<Character>();
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (board[i + x][j + y] != '.') temp.add(board[i + x][j + y]);
                    }
                }
                if (!checkOK(temp)) return false;
            }
        }

        return true;
    }

    private boolean checkOK(ArrayList<Character> c) {
        int[] test = new int[9];
        for (int i = 0; i < c.size(); i++) {
            test[c.get(i) - 49]++;
            if (test[c.get(i) - 49] > 1) return false;
        }
        return true;
    }
