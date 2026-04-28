public class GameLogic {
    private static final int SIZE = 3;
    private char[][] board;

    public GameLogic(char[][] board) {
        this.board = board;
    }

    public boolean checkWin(char player) {
        for (int i = 0; i < SIZE; i++) {
            if (checkRow(i, player) || checkColumn(i, player)) {
                return true;
            }
        }

        return checkDiagonals(player);
    }

    private boolean checkRow(int row, char player) {
        for (int col = 0; col < SIZE; col++) {
            if (board[row][col] != player) return false;
        }
        return true;
    }

    private boolean checkColumn(int col, char player) {
        for (int row = 0; row < SIZE; row++) {
            if (board[row][col] != player) return false;
        }
        return true;
    }

    private boolean checkDiagonals(char player) {
        boolean mainDiag = true;
        boolean antiDiag = true;

        for (int i = 0; i < SIZE; i++) {
            if (board[i][i] != player) mainDiag = false;
            
            if (board[i][SIZE - 1 - i] != player) antiDiag = false;
        }
        return mainDiag || antiDiag;
    }
}
