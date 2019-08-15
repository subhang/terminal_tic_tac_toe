package com.subhang;

public class Player {

    int playerId;
    String name;

    Player(String name,int playerId){
        this.name =name;
        this.playerId =playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }


}
