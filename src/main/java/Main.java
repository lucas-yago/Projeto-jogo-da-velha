import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JogoDaVelha game = new JogoDaVelha();

        System.out.println("\n====== Jogo da Velha ======\n");
        game.showBoard();

        while (true) {
            int row ;
            int column ;

            while (true) {
                try {
                    System.out.println("\nJogador " + game.getCurrentPlayer() + ", digite sua jogada: ");

                    System.out.print("Linha: ");
                    row = scanner.nextInt();

                    System.out.print("Coluna: ");
                    column = scanner.nextInt();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("=== Entrada inválida! Digite apenas números inteiros de 0 a 2. ===");
                    scanner.nextLine();
                }
            }

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
