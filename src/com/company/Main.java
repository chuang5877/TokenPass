package com.company;

public class Main {

    public static void main(String[] args) {
        TokenPass testGame = new TokenPass(10);
        int[] testBoard = testGame.getBoard();
        System.out.println("Constructed a testBoard:");
        for (int n = 0; n < testBoard.length; n++) {
            System.out.print(testBoard[n] + " ");
        }
        System.out.print('\n');
        testGame.distributeCurrentPlayerTokens();
        System.out.println("After distributing tokens from player "+testGame.getCurrentPlayer()+":");
        for (int n=0;n<testBoard.length;n++){
            System.out.print(testBoard[n]+" ");
        }
    }
}
