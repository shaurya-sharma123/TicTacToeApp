public class DrawLogic {
    private static final int SIZE = 3;
    private char[][] board;

    public DrawLogic(char[][] board) {
        this.board = board;
    }

    public boolean checkDraw() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (board[row][col] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
