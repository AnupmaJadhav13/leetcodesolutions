// Given an m x n grid of characters board and a string word, return true if word exists in the grid.
// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

// Example 1:
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
// Output: true

// Example 2:
// Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
// Output: true

class Solution {
    public boolean exist(char[][] board, String word) {
        
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++) {
                if(word.charAt(0) == board[i][j]){
                    boolean found=dfs(board, i, j, word, 0 );
                    if(found) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int r,int c,String word,int wordindex ){
        //base case
        if(wordindex == word.length()){
            return true;
        }

        //out of bound cases
        int rows = board.length;
        int cols= board[0].length;

        if(r<0 || c<0 || r>=rows || c>=cols){
            return false;
        }

        //invalid cases
        if(board[r][c] == ' '|| board[r][c] != word.charAt(wordindex)) {
            return false;
        }
        char ch=board[r][c];
        board[r][c]= ' ';

        //dfs calls
        if ( dfs(board, r-1, c, word, wordindex+1) || 
        dfs(board, r, c+1, word, wordindex+1) || 
        dfs(board, r+1, c, word, wordindex+1) || 
        dfs(board, r, c-1, word, wordindex+1) ){
            return true;
        }
        //backtraking
        board[r][c] = ch;
        return false;

    }
}