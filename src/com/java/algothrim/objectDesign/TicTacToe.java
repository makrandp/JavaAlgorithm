package com.java.algothrim.objectDesign;

import java.util.Arrays;
import java.util.Map;

//https://leetcode.com/problems/design-tic-tac-toe/

enum Option{
    UNDECIDED,PLAYER1,PLAYER2;
}

public class TicTacToe {
    int[] playes;
    Option[][] board;
    boolean isWin;

    public TicTacToe(int n){
        playes = new int[2];
        board = new Option[n][n];
        for (Option[] options :
                board) {
            Arrays.fill(options,Option.UNDECIDED);

        }
        isWin = false;
    }

    public int move(int row, int col, int player) {
        if(board[row][col] == Option.UNDECIDED){
            if(player == 1){
                board[row][col] = Option.PLAYER1;
            }
            if(player == 2){
                board[row][col] = Option.PLAYER2;
            }
        }
        return hasWinner();
    }


    private int hasWinner(){
        int vertical = hasWinnerVertical();
        int horizontal = hasWinnerHorizontal();
        int diagonal = hasWinnerDiagonal();

        if(vertical != 0 ){
            return vertical;
        }
        if(horizontal != 0 ){
            return  horizontal;
        }
        if(diagonal != 0){
            return  diagonal;
        }
        return 0;

    }

    private int hasWinnerVertical(){
        for (Option[] options :board) {
            int count = 1;
            Option current = options[0];
            for(int i = 1; i < options.length; i ++){
                if(options[i] == current && current != Option.UNDECIDED){
                    count++;
                    if(count == board.length){
                        return current == Option.PLAYER1 ? 1 : 2;
                    }
                }
            }
        }
        return 0;
    }

    private int hasWinnerHorizontal(){
        for(int x = 0; x < board.length; x ++){
            int count = 1;
            Option current = board[0][x];
            for(int y = 1; y < board.length; y++){
                if(board[y][x] == current && current != Option.UNDECIDED ){
                    count++;
                    if(count == board.length){
                        return current == Option.PLAYER1 ? 1 : 2;
                    }
                }
            }
        }
        return 0;
    }

    private int hasWinnerDiagonal(){
        int count = 1;
        Option current = board[0][0];
        for(int i = 1; i < board.length;i++){
            if(board[i][i] == current && current != Option.UNDECIDED){
                count++;
                if(count == board.length){
                    return current == Option.PLAYER1 ? 1 : 2;
                }
            }
        }

        count = 1;
        current = board[0][board.length -1];

        for(int i = 1;i < board.length; i++){
            if(board[i][board.length -1 - i] == current ){
                count ++;
                if(count == board.length && current != Option.UNDECIDED){
                    return current == Option.PLAYER1 ? 1 : 2;
                }
            }
        }

        return 0;
    }
}
