public class JogoDaVelha {

        private char[][] board;
        private char currentPlayer;

    public JogoDaVelha() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        currentPlayer = 'X';
    }

    public void showBoard() {

        System.out.println( "      0     1     2   ");
        System.out.println("   ───────────────────");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + "  |  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print("  |  ");
            }
            System.out.println();
            if (i < 2) System.out.println("   ┼─────┼─────┼─────┼");
        }
        System.out.println("   ───────────────────");

    }

    public boolean isMoveValid(int row, int column) {
        if (row < 0 || row > 2 || column < 0 || column > 2) {
            return false;
        }
        if (board[row][column] != ' ') {
            return false;
        }
        return true;
    }

    public void makeMove(int row, int column) {
        if (!isMoveValid(row, column)) {
            throw new IllegalArgumentException("Jogada inválida!");
        }
        board[row][column] = currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer &&
                    board[i][1] == currentPlayer &&
                    board[i][2] == currentPlayer) return true;

            if (board[0][i] == currentPlayer &&
                    board[1][i] == currentPlayer &&
                    board[2][i] == currentPlayer) return true;
        }
        if (board[0][0] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][2] == currentPlayer) return true;

        if (board[0][2] == currentPlayer &&
                board[1][1] == currentPlayer &&
                board[2][0] == currentPlayer) return true;

        return false;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
}

