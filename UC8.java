public class GameEngine {
    private boolean isGameRunning = true;
    private int currentPlayer = 1;
    public void startGame() {
        System.out.println("--- Game Started ---");

        while (isGameRunning) {
            startTurn();
            processMove();
            
            if (checkWinOrDraw()) {
                isGameRunning = false; 
                System.out.println("Game Over!");
            } else {
                switchTurn(); 
            }
        }
    }

    private void startTurn() {
        System.out.println("\nPlayer " + currentPlayer + "'s turn.");
    }

    private void processMove() {
        System.out.println("Player " + currentPlayer + " makes a move.");
    }

    private boolean checkWinOrDraw() {
        return false; 
    }

    private void switchTurn() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    public static void main(String[] args) {
        new GameEngine().startGame();
    }
}
