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

}

