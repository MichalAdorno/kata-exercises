package com.myself.concurrency.diningphilosophers;


public class App {

    public static void main(String[] args){

        Diner diner = new Diner(5, 200);
        diner.putCutleryOnTable();
        diner.commenceDinerOfPhilosophers();

    }


}
