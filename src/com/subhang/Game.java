package com.subhang;

import java.util.List;
import java.util.Scanner;

public class Game {

    int gameId;
    List<Player> players;
    TicTacBoard ticTacBoard;
    Player turn;
    Player winner;
    Game(int boardSize,List<Player> players){
        System.out.println("initializing players in the game... ");
        this.players = players;
        ticTacBoard = new TicTacBoard(boardSize,players);
    }



    void run(){

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.println(ticTacBoard);
            turn = ticTacBoard.getTurn();
            System.out.println(turn + "'s Turn");
            System.out.println("Enter row and column");
            int row = scan.nextInt();
            int column = scan.nextInt();
            Move move = new Move(row,column,turn);
            winner = ticTacBoard.makeMove(move);
            if(winner != null) {
                System.out.println(winner + " wins");
                break;
            }


        }

    }

}
