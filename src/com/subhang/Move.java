package com.subhang;

public class Move {

    int row;
    int y;
    Player player;

    public Move(int row, int y, Player player) {
        this.row = row;
        this.y = y;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public int getY() {
        return y;
    }

    public Player getPlayer() {
        return player;
    }
}

