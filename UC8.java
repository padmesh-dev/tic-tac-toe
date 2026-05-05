import java.util.Scanner;

public class UC8 {

    static char[][] board = new char[3][3];

    // UC8: Game Loop
    static void playGame() {
        Scanner sc = new Scanner(System.in);
        boolean playerTurn = true;

        while (true) {

            if (playerTurn) {
                playerMove(sc);

                if (checkWin('X')) {
                    System.out.println("Player wins!");
                    break;
                }

            } else {
                computerMove();

                if (checkWin('O')) {
                    System.out.println("Computer wins!");
                    break;
                }
            }

            if (isDraw()) {
                System.out.println("It's a draw!");
                break;
            }

            // Switch turn
            playerTurn = !playerTurn;
        }

        sc.close();
    }

    // Dummy methods (assumed implemented in previous UC)
    static void playerMove(Scanner sc) {}
    static void computerMove() {}
    static boolean checkWin(char symbol) { return false; }
    static boolean isDraw() { return false; }
}