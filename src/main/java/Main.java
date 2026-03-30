import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha game = new JogoDaVelha();

        System.out.println("\n====== Jogo da Velha ======\n");
        game.showBoard();

        while (true) {
            System.out.println("Jogador " + game.getCurrentPlayer() + ", digite sua jogada: ");

            System.out.println("Linha: ");
            int row = scanner.nextInt();

            System.out.println("Coluna: ");
            int column = scanner.nextInt();

            try {
                game.makeMove(row, column);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            game.showBoard();

            if (game.checkWinner()) {
                System.out.println("O Jogador " + game.getCurrentPlayer() + " venceu a partida!");
                break;
            }

            if (game.isDraw()) {
                System.out.println("A partida acabou em Empate!");
                break;
            }

            game.switchPlayer();
        }
        scanner.close();
    }
}
