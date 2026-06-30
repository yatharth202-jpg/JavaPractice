// WAP to imagine a chess board and place maximun queen piece on it so that no pieace cut eachother
import java.util.*;

public class NQueensProblem {
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // check left side in current row
        for (int j = 0; j < col; j++) {
          if (board[row][j] == 'Q') {
             return false;
             }
         }
        // check upper-left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
             if (board[i][j] == 'Q') {
                return false;
                     }
         }
        // check lower-left diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
             if (board[i][j] == 'Q') {
                 return false;
                     }
         }
        return true;
    }

    public void SaveBoard(char[][] board, List<List<String>> allBoard) {
        int n = board.length;
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(board[i][j] == 'Q' ? 'Q' : '.');
            }
            newBoard.add(sb.toString());
        }
        allBoard.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        int n = board.length;
        if (col == n) {
            SaveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> SolveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) Arrays.fill(board[i], '.');
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        NQueensProblem solver = new NQueensProblem();
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter board length : ");
        List<List<String>> boards = solver.SolveNQueens(sc.nextInt());
        for (List<String> b : boards) {
            for (String r : b) System.out.println(r);
            System.out.println();
        }
        sc.close();
    }
}
