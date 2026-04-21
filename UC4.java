public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {

        System.out.println("Move (1,1): " + isValidMove(1, 1));
        board[1][1] = 'X';
        System.out.println("Move (1,1) again: " + isValidMove(1, 1)); 
        System.out.println("Move (3,3): " + isValidMove(3, 3)); 
    }


    static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}
