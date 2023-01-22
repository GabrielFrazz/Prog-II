package boardgame;

public class Board {
    
    protected static final int tam = 3;
    private char[][] board;
    private StatusPlace[][] status;

    public Board(){
        board = new char[3][3];
        status = new StatusPlace[3][3];
        clear();
    }

    public void clear(){
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                board[i][j] = ' ';
                status[i][j] = StatusPlace.EMPTY;
            }
        }
    }

    public boolean isEmpty(int row, int collumn){
        if(status[row][collumn] == StatusPlace.EMPTY){
            return false;
        }
        System.out.println();
        System.out.println("position already taken! ");
        System.out.println();
        return true;
    }

    public void setPlayer(int row, int collumn, char symbol){
        if(symbol == 'O'){
            status[row][collumn] = StatusPlace.PLAYER2;
        }
        else if(symbol == 'X'){
            status[row][collumn] = StatusPlace.PLAYER1;
        }
        board[row][collumn] = symbol;
    }

    public boolean checkWin(char symbol){
        //check row
        for(int i = 0; i < tam; i ++){
            if(board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol){
                return true;
            }
        }

        //check columns
        for(int i = 0; i < tam; i++){
            if(board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol){
                return true;
            }
        }

        //check leading diagonal
        int count = 0;
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if(i==j){
                    if(board[i][j] == symbol){
                        count++;
                    }
                }
            }
        }
         if(count == 3){
            return true;
         }

         //check second diagonal
         count = 0;
         int j = 2;
         for (int i = 0; i < tam; i++){
            if(board[i][j] ==symbol){
                count ++;
            }
            j--;
         }

         if(count == 3){
            return true;
         }

         //not win
         return false;
    }

    public boolean checkDraw(){
        for(int i = 0; i < tam; i++){
            for(int j = 0; j < tam; j++){
                if(board[i][j] == ' '){
                    return false;
                }
            }
        }
        return true;
    }

    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n     0   1   2\n");
        for (int i = 0; i < 3; i++) {
          sb.append("  " + i + " ");
          for (int j = 0; j < 3; j++) {
            sb.append(" " + board[i][j] + " ");
            if (j < 2) {
              sb.append("|");
            }
          }
          if (i < 2) {
            sb.append("\n    -----------\n");
          }
        }
        System.out.println(sb.toString() + "\n");
      }
    
}