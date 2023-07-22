class Main {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        // Initialize the board
        game.initializeBoard();

        // Print the initial board
        game.printBoard();

        // Player X moves
        game.updateBoard(0, 0);

        // Print the updated board
        game.printBoard();

        // Player O moves
        game.updateBoard(0, 1);

        // Print the updated board
        game.printBoard();

        // Player X moves
        game.updateBoard(1, 1);

        // Print the updated board
        game.printBoard();

        // Player O moves
        game.updateBoard(1, 2);

        // Print the updated board
        game.printBoard();

        // Player X moves
        game.updateBoard(2, 2);

        // Print the updated board
        game.printBoard();

        // Check the game result
        String result = game.gameResult();
        System.out.println(result);
    }
}