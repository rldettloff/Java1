class  {
    public static void main(String[] args) {
        GoBoard game = new GoBoard();

        game.printBoard(); // print the initial board

        game.playStone(3, 3); // black plays at (3, 3)
        game.playStone(4, 4); // white plays at (4, 4)
        game.playStone(3, 4); // black plays at (3, 4)
        game.playStone(4, 3); // white plays at (4, 3)

        game.printBoard(); // print the updated board
    }
}
