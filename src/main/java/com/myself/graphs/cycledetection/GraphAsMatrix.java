package com.myself.graphs.cycledetection;



public class GraphAsMatrix {

    private int v;
    private int[] vertices;
    private int[][] edges;

    public GraphAsMatrix(int v) {
        this.v = v;
        this.edges = new int[v][v];
    }

    public GraphAsMatrix(int[][] representation) {
        if(representation == null || representation.length != representation[0].length || representation.length <= 1){
           throw new IllegalStateException();
        }

        this.v = representation.length;
        this.edges = representation;
        this.vertices = new int[v];
    }

    public boolean existsDirectedEdge(int i, int j){
        return edges[i][j] > 0;
    }

    public void visit(int i, int cnt){
        vertices[i] = cnt;
    }

    private boolean isVisitedInCycle(int i, int cnt){
        return (vertices[i] == cnt);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder("");
        for(int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                builder.append(edges[i][j]).append(" ");
            }
            if(i != v - 1) builder.append("\n");
        }
        return builder.toString();
    }

    public boolean isCyclicNoDirection(){
        for(int i = 0; i < v; i++)
            if(followTransitionPath(i, i + 1) == i + 1)
                return true;

        return false;
    }

    private int followTransitionPath(int j, int cnt){
        if(isVisitedInCycle(j, cnt))
            return cnt;

        visit(j, cnt);

        for (int k = 0; k < v; k++)
            if (existsDirectedEdge(j, k) && followTransitionPath(k, cnt) == cnt)
                    return cnt;

        return 0;
    }


}
