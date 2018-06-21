package com.myself.concurrency.diningphilosophers;


import java.util.concurrent.ThreadLocalRandom;

public class Philosopher implements Runnable {

    private int diningRounds;
    private int currentRound = 0;
    private Long fork1;
    private Long fork2;

    private int number;

    public Philosopher(int number, int diningRounds) {
        this.number = number;
        this.diningRounds = diningRounds;
    }

    @Override
    public void run(){
        dine();
    }

    public void dine(){

        for(int i = 0; i < diningRounds; i++){
            currentRound = i;
            think();
            synchronized (fork1){
                takeFork(fork1);
                synchronized (fork2){
                    takeFork(fork2);
                    eat();
                    putForkOnTable(fork2);
                }
                putForkOnTable(fork1);
            }
        }
    }

    private void think(){
        System.out.println(cout("thinking"));
        pause();
    }

    private void eat(){
        System.out.println(cout("eating"));
        pause();
    }

    private void takeFork(Object fork){
        System.out.println(cout(String.format("taking the fork {%d}", fork)));
        pause();
    }

    private void putForkOnTable(Long fork){
        System.out.println(cout(String.format("putting the fork {%d} on the table", fork)));
        pause();
    }

    private void pause(){
        long millis = ThreadLocalRandom.current().nextLong(10) * 100L;

        try {
            Thread.currentThread().sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private String cout(String activity){
        return String.format("<%d> [%d] Philosopher is: %s", currentRound, number, activity);
    }

    public Philosopher setFork1(Long fork1) {
        this.fork1 = fork1;
        return this;
    }

    public Philosopher setFork2(Long fork2) {
        this.fork2 = fork2;
        return this;
    }

    public Philosopher setDiningRounds(int diningRounds) {
        this.diningRounds = diningRounds;
        return this;
    }
}
