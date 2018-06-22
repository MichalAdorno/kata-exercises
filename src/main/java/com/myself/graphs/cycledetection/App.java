package com.myself.graphs.cycledetection;


public class App {

    public static void main(String[] args) {

        int[][] representation;
        GraphAsMatrix graph;
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,1,0},
                {1,0,1,0},
                {1,1,0,1},
                {0,0,1,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + " while expected " + true); //just for simplicity, we don't use unit tests here, could be otherwise done with assertJ very nicely
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1},
                {0,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + " while expected " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + " while expected " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {1,0,1,0},
                {0,0,0,1},
                {0,0,1,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + " while expected " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {0,0,0,0},
                {0,0,0,1},
                {0,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {1,0,0,0},
                {0,0,0,1},
                {0,0,1,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1},
                {1,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {0,0,1,0},
                {0,1,0,1},
                {1,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {1,1,1,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,1},
                {0,0,1},
                {0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,1},
                {0,0,1},
                {1,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1},
                {1,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0},
                {0,0,1,0},
                {0,1,0,1},
                {1,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1},
                {0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0},
                {0,1}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0,0},
                {0,0,1,0,0},
                {0,0,0,1,0},
                {1,0,0,0,0},
                {0,0,0,0,0},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,0},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,1},
                {1,0,0,0,0},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,0},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,1},
                {1,0,0,0,0},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {1,0,0,0,0},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,0},
                {0,1,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {1,1,1,1,1},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {1,1,1,1,0},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {1,1,1,1,1},
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0},
                {1,0,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0,0},
                {0,0,0,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + false);
        //---
        System.out.println("**************************");
        representation = new int[][]{
                {0,1,0,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0}
        };
        graph = new GraphAsMatrix(representation);
        System.out.println(graph);
        System.out.println(graph.isCyclicDirected() + ", while expected: " + true);
        //---
    }

}
