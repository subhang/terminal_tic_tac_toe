package com.subhang;

import java.util.List;

public class TicTacBoard extends TurnableBoardGame{


    Player[][] gameBoard;
    int boardSize;


    public TicTacBoard(int boardSize, List<Player> playerList){

        super(playerList);
        this.boardSize = boardSize;
        intializeGameBoard();
    }

    private void intializeGameBoard(){

        boardSize = this.boardSize;
        gameBoard = new Player[boardSize][boardSize];
        System.out.println("Initializing tic tac toe board with size" + boardSize + "....");
        for(int i= 0;i < boardSize;i++){
            for(int j=0;j<boardSize;j++){
                this.gameBoard[i][j] = null;
            }
        }

    }

    public Player getTurn(){

        return turn;
    }

    Player makeMove(Move move){

        if(!validateMove(move)){

            System.out.println("Enter Valid move");
            return null;
        }
        int row =  move.getRow();
        int column = move.getY();
        gameBoard[row][column] = turn;
        if(checkWinCondition( move.getRow(),move.getY(), move.getPlayer())){
            return move.getPlayer();
        }
        updateTurn();
        return null;

    }

    boolean validateMove(Move move){

        int row = move.getRow();
        int column = move.getY();
        if(row >= boardSize) return false;
        if(column >= boardSize) return false;
        if(gameBoard[row][column] != null){
            return false;
        }
        return true;

    }

    boolean checkWinCondition(int row,int column,Player player){

        if(checkRow(row,player) || checkColumn(column,player) || checkDiagonals(player)) return true;
        return false;
    }

    boolean checkRow(int row,Player player){

        for(int i = 0;i < boardSize;i++){
            if(gameBoard[row][i] != player) return false;
        }
        return true;
    }

    boolean checkColumn(int column,Player player){
        for(int i = 0;i < boardSize;i++){
            if(gameBoard[i][column] != player) return false;
        }
        return true;

    }
    boolean checkDiagonals(Player player){

        boolean leftDiagonal =true;
        boolean rightDiagonal = true;
        for(int i = 0; i < boardSize;i++){
            if(gameBoard[i][i] != player) leftDiagonal = false;

        }
        for(int i = 0;i< boardSize;i++){
            if(gameBoard[i][boardSize-i-1] != player) rightDiagonal =  false;
        }
        if(leftDiagonal || rightDiagonal) return true;
        return false;
    }
    @Override
    public String toString(){

        String boardString = new String();
        for(int i = 0;i < boardSize;i++){


            for(int j = 0;j < boardSize;j++){

                if(gameBoard[i][j] == null){
                    boardString += ".";
                }
                else{
                    boardString += gameBoard[i][j];
                }

            }
            boardString += "\n";
        }
        return boardString;

    }





}
