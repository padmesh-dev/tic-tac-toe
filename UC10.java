public class UC10 {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    // UC10: Check if the game is a draw
    static boolean isDraw() {

        // Traverse entire board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any cell is empty, it's not a draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }

    // Test method
    public static void main(String[] args) {
        if (isDraw()) {
            System.out.println("It's a draw!");
        } else {
            System.out.println("Moves still possible.");
        }
    }
}