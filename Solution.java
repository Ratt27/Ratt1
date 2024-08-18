import java.util.ArrayList;
import java.util.List;

class Solution {

    public Boolean isSafe(int row, int col, char[][] board) {
        // checking horizontally
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // checking vertically
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // checking upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // checking upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row); // here we are adding all the rows to the new board
        }
        allBoards.add(newBoard);
    }

    // This 'helper' function is going to be the recursive function and we will do backtracking here:
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) { // when column is equal to n, that is, we have reached the last column
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {

            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n]; // creating 2D character array of size n*n
        // calling the helper function:
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // You can change this value to solve for different sizes
        List<List<String>> results = solution.solveNQueens(n);

        // Printing the solutions
        for (List<String> board : results) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
