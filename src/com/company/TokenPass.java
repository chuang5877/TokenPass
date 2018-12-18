package com.company;

public class TokenPass {
    private int[]board;

    public int[] getBoard() {
        return board;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    private int currentPlayer;
    public TokenPass(int PlayerCount){
        board=new int[PlayerCount];
        for(int x=0;x<board.length;x++){
            board[x]=(int)(Math.random()*10
            );
        }
    }
    public void distributeCurrentPlayerTokens(){
        int i=board[currentPlayer],x=1,n=currentPlayer+1;
        board[currentPlayer]=0;
        while (x<=i){
            if(n<board.length){
                board[n]++;
                n++;
                x++;
            }else{
                n=0;
                board[n]++;
                x++;
            }
        }
    }
}
