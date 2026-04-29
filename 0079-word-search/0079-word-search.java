class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(fun(board, word, i, j,0)) return true;
                }
            }
        }
        return false;
    }

    boolean fun(char[][] board, String word, int r, int c,int idx){
        if(word.length() == idx) return true;

        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length) return false;

        if(board[r][c] != word.charAt(idx)) return false;

        char ch = board[r][c];
        board[r][c] = ' ';

        boolean flag = false;
        flag |= fun(board, word, r - 1, c,idx+1);
        flag |= fun(board, word, r + 1, c,idx+1);
        flag |= fun(board, word, r, c - 1,idx+1);
        flag |= fun(board, word, r, c + 1,idx+1);

        board[r][c] = ch;
        return flag;
    }
}