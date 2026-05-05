import java.util.Random;

public class UC7 {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        initializeBoard();

        computerMove();

        printBoard();
    }

    // Initialize board with empty cells
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC6: Place move
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // UC7: Computer makes random valid move
    static void computerMove() {
        Random rand = new Random();
        int row, col;

        while (true) {
            int slot = rand.nextInt(9) + 1; // 1–9

            // Convert slot to row & column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Check if empty
            if (board[row][col] == '-') {
                placeMove(row, col, 'O');
                System.out.println("Computer placed at slot: " + slot);
                break;
            }
        }
    }

    // Print board
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}