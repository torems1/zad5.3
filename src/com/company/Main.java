package com.company;

import java.util.Arrays;

public class Main {

    static int N = 5;
    static int K = 2;
    static int maxWins = 7;
    static int curWins = 0;
    static Player[] players = new Player[N];
    static gameCube[] cubes = new gameCube[K];

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            players[i] = new Player();
            players[i].setID(i);
        }
        for (int i = 0; i < K; i++)
            cubes[i] = new gameCube();

        startGame();
        }

        public static void startGame(){
            for (int i = 0; i < 7; i++) {
                throwCubes();
                checkResult();
                System.out.println("Win player: " + players[N - 1].showID());
                players[N - 1].celebrateVictory();
                if (curWins == maxWins)
                    break;
            }
        }
        public static void throwCubes () {
            Arrays.sort(players);
            for (Player player : players) {
                player.resetPoints();
            }
        }
        public static void checkResult(){
            Arrays.sort(players);
            for(Player player:players){
                player.resetPoints();
        }
    }
}


