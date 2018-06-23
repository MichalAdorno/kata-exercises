package com.myself.concurrency.diningphilosophers;


import com.myself.graphs.cycledetection.GraphAsMatrix;

public class App {

    public static void main(String[] args){

        System.out.println("***************************************************");
        Diner diner = new Diner(5, 10);
        diner.putCutleryOnTable();
        diner.commenceDinerOfPhilosophers();
        diner.join();

        System.out.println("***************************************************");
        int[][] representation = new int[][]{
                {0,1,0,0,1},
                {1,0,1,0,0},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {1,0,0,1,0},
        };
        GraphAsMatrix graph = new GraphAsMatrix(representation);
        GeneralizedDiner generalizedDiner = new GeneralizedDiner(graph, 10);
        generalizedDiner.putCutleryOnTable();
        generalizedDiner.commenceDinerOfPhilosophers();
        generalizedDiner.join();

    }


}
