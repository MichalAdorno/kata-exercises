package com.myself.concurrency.diningphilosophers;


import com.myself.graphs.cycledetection.GraphAsMatrix;

public class GeneralizedDiner extends Diner {

    private GraphAsMatrix protocol;

    public GeneralizedDiner(GraphAsMatrix protocol, int diningRounds) {
        super(protocol.getV(), diningRounds);
        this.protocol = protocol;
    }

    public GraphAsMatrix getProtocol() {
        return protocol;
    }

    @Override
    public void putCutleryOnTable(){
        for(int i = 0; i < protocol.getV(); i++){
            for(int j = 0; j < protocol.getV(); j++) {
                if(protocol.existsDirectedEdge(i,j) && philosophers[i].getFork1() == null)
                    philosophers[i].setFork1(forks[j]);
                if(protocol.existsDirectedEdge(i,j) && philosophers[i].getFork1() != null && philosophers[i].getFork2() == null)
                    philosophers[i].setFork2(forks[j]);
            }

        }
    }
}
