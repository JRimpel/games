package code;

public class Board {
    private Checker[][] board;
    public Board(){
        board = new Checker[8][8];
        int position = 0;
        for(int i = 0; i < board.length; i++)
            for (int k = 0; k < board[i].length; k++){
                position++;
                if (i % 2 == 0 && k % 2 == 0 && i <= 2)
                    board[i][k] = new Checker(position, "white", true);
                else if (i % 2 != 0 && k % 2 != 0 && i <= 2)
                    board [i][k] = new Checker(position, "white", true); 
                else if (i % 2 == 0 && k % 2 == 0 && i >= 5)
                    board [i][k] = new Checker(position, "black", true);
                else if (i % 2 != 0 && k % 2 != 0 && i >= 5)
                    board [i][k] = new Checker(position, "black", true);
                else 
                    board[i][k] = new Checker(position);     
            }
    }
    public String toString(){
        String print = "";
        for (int i = 0; i < board.length; i++){
            print += '\n';
            for (int k = 0; k < board[i].length; k++){
                print += board[i][k];
            }
        }    
        return print;

    }
}
