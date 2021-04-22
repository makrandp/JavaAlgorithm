package com.java.algothrim.array;

import java.util.*;

//https://leetcode.com/problems/game-of-life/
public class GameofLife {
    public Cell[][] gameBoard;

    public GameofLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        gameBoard = new Cell[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                gameBoard[i][j] = new Cell(j, i, board[i][j], this);
            }
        }

    }

    public GameofLife next() {

        int m = this.gameBoard.length;
        int n = this.gameBoard[0].length;

        int[][] newGameBoard = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newGameBoard[i][j] = this.gameBoard[i][j].next().value;
            }
        }

        return new GameofLife(newGameBoard);
    }

    @Override
    public String toString() {
        return Arrays.toString(gameBoard);
    }


}

class Cell {
    public int x;
    public int y;
    public int value;
    public GameofLife board;

    public Cell(int x, int y, int value, GameofLife board) {
        this.x = x;
        this.y = y;
        this.value = value;
        this.board = board;
    }

    public boolean isAlive() {
        return this.value == 1;
    }

    public Map<String, Cell> getNeighbors() {
        Map<String, Cell> neighbors = new HashMap<>();

        int m = board.gameBoard.length;
        int n = board.gameBoard[0].length;

        if (x >= 0 && x < n && y >= 0 && y < m) {
            if (y - 1 >= 0) {
                Cell top = new Cell(this.x, this.y - 1, board.gameBoard[y - 1][x].value, board);
                neighbors.put("top", top);
            }
            if (y + 1 < n) {
                Cell bottom = new Cell(this.x, this.y + 1, board.gameBoard[y + 1][x].value, board);
                neighbors.put("bottom", bottom);
            }


            if (x - 1 >= 0) {
                Cell left = new Cell(this.x - 1, this.y, board.gameBoard[y][x - 1].value, board);
                neighbors.put("left", left);

            }

            if (x + 1 < n) {
                Cell right = new Cell(this.x + 1, this.y, board.gameBoard[y][x + 1].value, board);
                neighbors.put("right", right);

            }

            if (x - 1 >= 0 && y - 1 >= 0) {
                Cell topLeft =
                        new Cell(this.x - 1, this.y - 1, board.gameBoard[y - 1][x - 1].value,
                                board);
                neighbors.put("topLeft", topLeft);

            }

            if (x + 1 < n && y - 1 >= 0) {
                Cell topRight =
                        new Cell(this.x + 1, this.y - 1, board.gameBoard[y - 1][x + 1].value,
                                board);
                neighbors.put("topRight", topRight);

            }

            if (x - 1 >= 0 && y + 1 < m) {
                Cell bottomLeft =
                        new Cell(x - 1, y + 1, board.gameBoard[y + 1][x - 1].value, board);
                neighbors.put("bottomLeft", bottomLeft);

            }

            if (x + 1 < n && y + 1 < m) {
                Cell bottomRight =
                        new Cell(x + 1, y + 1, board.gameBoard[y + 1][x + 1].value, board);
                neighbors.put("bottomRight", bottomRight);

            }
        }


        return neighbors;
    }

    public Cell next() {
        Map<String, Cell> neighbors = getNeighbors();

        Collection<Cell> collection = neighbors.values();

        int alive = 0;
        int dead = 0;

        for (Cell cell : collection) {
            if (cell.value == 0) {
                dead++;
            } else {
                alive++;
            }
        }

        System.out.println("x = " + this.x + " y = " + y);
        System.out.println(neighbors);
        System.out.println("alive= " + alive);
        System.out.println("dead=" + dead);

        if(this.value == 1){
            System.out.println("this.value =" + this.value );
            if (alive < 2) {
                System.out.println("return=" + 0);
                System.out.println();
                return new Cell(this.x,this.y,0,board);
            }
            if (alive == 2 || alive == 3) {
                System.out.println("return=" + 1);
                System.out.println();
                return new Cell(this.x,this.y, 1,board);
            }
            if (alive > 3) {
                System.out.println("return=" + 0);
                System.out.println();
                return new Cell(this.x,this.y, 0,board);
            }
        }

        if(this.value == 0){
            System.out.println("this.value =" + this.value );
            if (alive == 3) {
                System.out.println("return=" + 1);
                System.out.println();
                return new Cell(this.x,this.y, 1,board);
            }
        }

        System.out.println();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}


