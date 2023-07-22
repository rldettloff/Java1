class TicTacToe {

    private final int boardLength = 3;
    private final String emptyCell = " E ";
    private final String X = " X ";
    private final String O = " O ";
    private String whoseTurn = " X ";
    private String[][] board = new String[boardLength][boardLength];

    TicTacToe() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = X;
    }

    private void changeTurn() {
        if (whoseTurn == X) {
            whoseTurn = O;
        } else {
            whoseTurn = X;
        }
    }

    public void updateBoard(int x, int y) {
        if (x >= boardLength || x < 0 || y >= boardLength || y < 0) {
            System.out.println("invalid coordinate x: " + x + "y: " + y);
        } else if (board[x][y] != emptyCell) {
            System.out.println("invalid move. cell not empty");
        } else {
            board[x][y] = whoseTurn;
            changeTurn();
        }
    }

    public void initializeBoard() {
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                board[i][j] = emptyCell;
            }
        }
        whoseTurn = X;
    }

    public void printBoard() {
        System.out.println("current turn: " + whoseTurn);
        for (int i=0; i< board.length; i++) {
            for (int j=0; j< board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public String gameResult() {
        // Check for horizontal wins
        for (int i = 0; i < boardLength; i++) {
            if (board[i][0] != emptyCell && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0] + " wins!";
            }
        }

        // Check for vertical wins
        for (int j = 0; j < boardLength; j++) {
            if (board[0][j] != emptyCell && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return board[0][j] + " wins!";
            }
        }

        // Check for diagonal wins
        if (board[0][0] != emptyCell && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0] + " wins!";
        }
        if (board[0][2] != emptyCell && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2] + " wins!";
        }

        // Check for tie
        boolean GameTie = true;
        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                if (board[i][j] == emptyCell) {
                    GameTie = false;
                break;
                }
                }
                }
                if (GameTie) {
                return "It's a tie!";
                }
                    // If no winner and no tie, continue game
    return "continue";
}
}