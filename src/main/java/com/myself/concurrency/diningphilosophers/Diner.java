package com.myself.concurrency.diningphilosophers;


public class Diner {

    private int diningRounds;
    private Philosopher[] philosophers;
    private Thread[] threads;
    private Long[] forks;
    private int numberOfDiningPhilosophers;

    public Diner(int numberOfDiningPhilosophers, int diningRounds) {
        this.diningRounds = diningRounds;
        this.numberOfDiningPhilosophers = numberOfDiningPhilosophers;
        this.philosophers = new Philosopher[numberOfDiningPhilosophers];
        this.forks = new Long[numberOfDiningPhilosophers];
        this.threads = new Thread[numberOfDiningPhilosophers];

        for(int i = 0; i < numberOfDiningPhilosophers; i++){
            philosophers[i] = new Philosopher(i + 1, diningRounds);
        }

        for(int i = 0; i < numberOfDiningPhilosophers; i++){
            forks[i] = new Long(i);
        }

        for(int i = 0; i < numberOfDiningPhilosophers; i++){
            threads[i] = new Thread(philosophers[i]);
        }
    }

    public void putCutleryOnTable(){
        for(int i = 0; i < numberOfDiningPhilosophers; i++){
            if(i == numberOfDiningPhilosophers - 1) {
                philosophers[i].setFork1(forks[0]);
                philosophers[i].setFork2(forks[numberOfDiningPhilosophers - 1]);
            } else {
                philosophers[i].setFork1(forks[i]);
                philosophers[i].setFork2(forks[(i + 1) % numberOfDiningPhilosophers]);
            }
        }
    }

    public void commenceDinerOfPhilosophers(){
        for(int i = 0; i < numberOfDiningPhilosophers; i++){
            threads[i].start();
        }
    }

}
