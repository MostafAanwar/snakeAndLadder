public class Board {
    private int[] board = new int[30];


    //constructor that initializes the board
    public Board(){
        for(int i = 0;i < 5;i++){
            board[i] = 0;
            board[2] = 19;
            board[4] = 3;
            board[10] = 15;
            board[16] = -13;
            board[18] = -12;
            board[19] = 9;
            board[20] = -12;
            board[26] = -26;
        }
    }
}
