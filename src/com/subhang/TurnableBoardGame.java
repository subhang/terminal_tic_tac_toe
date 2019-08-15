package com.subhang;

import java.util.List;

public abstract class TurnableBoardGame{

    Player turn;

    List<Player> playerList;

    TurnableBoardGame(List<Player> playerList){
        this.playerList = playerList;
        initializeTurn();
    }

    private void initializeTurn(){

        turn = playerList.get(0);
    }

    void updateTurn(){

        int playerIndex = playerList.indexOf(turn);
        int newIndex = (playerIndex + 1) % (playerList.size());
        this.turn = playerList.get(newIndex);


    }

}
