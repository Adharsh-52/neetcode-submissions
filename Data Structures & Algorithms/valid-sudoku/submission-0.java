class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> rowKeys = new HashSet<>();
        HashSet<String> colKeys = new HashSet<>();
        HashSet<String> boxKeys = new HashSet<>();
        boolean toStop = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.')
                    continue;

                char num = board[i][j];

                String rowValues = "row" + i + num;

                if (rowKeys.contains(rowValues)) {
                    toStop = false;
                    break;
                } else {
                    rowKeys.add(rowValues);
                }

                String colValues = "col" + j + num;

                if (colKeys.contains(colValues)) {
                    toStop = false;
                    break;
                } else {
                    colKeys.add(colValues);
                }

                String boxValues = "box" + (i / 3) + (j / 3) + num;

                if (boxKeys.contains(boxValues)) {
                    toStop = false;
                    break;
                } else {
                    boxKeys.add(boxValues);
                }
            }
            if (!toStop)
                break;
        }
        return toStop;
    }
}
