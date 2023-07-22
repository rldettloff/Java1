class GoBoard{
        private enum StoneBoard { //Enum lets me set variables to be predefined constants!
            EMPTY,
            BLACK,
            WHITE
        }
    
        private StoneBoard[][] board;
        private StoneBoard turn;
    
        public StoneBoard() {
            board = new StoneBoard[19][19];
            for (int i = 0; i < 19; i++) {
                for (int j = 0; j < 19; j++) {
                    board[i][j] = StoneBoard.EMPTY;
                } //create empty stone board
            }
            turn = StoneBoard.BLACK;
        }
    
        public void printBoard() {
            for (int i = 0; i < 19; i++) {
                for (int j = 0; j < 19; j++) {
                    switch (board[i][j]) {
                        case EMPTY:
                            System.out.print("E");
                            break;
                        case BLACK:
                            System.out.print("X");
                            break;
                        case WHITE:
                            System.out.print("O");
                            break;
                    }
                }
                System.out.println(); //print empty stoneBoard
            }
        }
    
        public void playStone(int x, int y) {
            if (board[x][y] != StoneBoard.EMPTY) {
                System.out.println("Illegal move");
                return;
            }
    
            if (turn == StoneBoard.BLACK) {
                board[x][y] = StoneBoard.BLACK;
                turn = StoneBoard.WHITE;
            } else {
                board[x][y] = StoneBoard.WHITE;
                turn = StoneBoard.BLACK;
            }
        }
    }
