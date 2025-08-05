import java.util.Stack;

public class Str23wordsearch {
    static class State {
        int i, j, index;
        char[][] board;

        State(int i, int j, int index, char[][] board) {
            this.i = i;
            this.j = j;
            this.index = index;
            this.board = copyBoard(board);
        }

        private char[][] copyBoard(char[][] original) {
            char[][] copy = new char[original.length][original[0].length];
            for (int i = 0; i < original.length; i++) {
                System.arraycopy(original[i], 0, copy[i], 0, original[0].length);
            }
            return copy;
        }
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Stack<State> stack = new Stack<>();
                stack.push(new State(i, j, 0, board));

                while (!stack.isEmpty()) {
                    State curr = stack.pop();
                    int x = curr.i, y = curr.j, idx = curr.index;
                    char[][] b = curr.board;

                    if (idx == word.length()) return true;
                    if (x < 0 || y < 0 || x >= m || y >= n || b[x][y] != word.charAt(idx)) continue;

                    char temp = b[x][y];
                    b[x][y] = '#';

                    stack.push(new State(x + 1, y, idx + 1, b));
                    stack.push(new State(x - 1, y, idx + 1, b));
                    stack.push(new State(x, y + 1, idx + 1, b));
                    stack.push(new State(x, y - 1, idx + 1, b));

                    b[x][y] = temp;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Str23wordsearch ws = new Str23wordsearch();
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        System.out.println(ws.exist(board, "ABCCED")); // true
        System.out.println(ws.exist(board, "SEE"));    // true
        System.out.println(ws.exist(board, "ABCB"));   // false
    }
}
