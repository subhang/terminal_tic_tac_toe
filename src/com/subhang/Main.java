package com.subhang;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Player player1 = new Player("X",0);
        Player player2 = new Player("O",1);
        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        Game game = new Game(3,playerList);
        game.run();
    }
}
