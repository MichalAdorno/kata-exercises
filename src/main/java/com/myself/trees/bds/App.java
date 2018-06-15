package com.myself.trees.bds;


import com.myself.trees.BinaryTree;

public class App {

    public static void main(String[] args) {

        System.out.println(BinaryTree.breadthFirstTraversal(buildExample1()));
        System.out.println(BinaryTree.breadthFirstTraversal(buildExample2()));
        System.out.println(BinaryTree.breadthFirstTraversal(buildExample3()));

        System.out.println("ABCDEFGH".equals(BinaryTree.breadthFirstTraversal(buildExample1())));
        System.out.println("ABCD".equals(BinaryTree.breadthFirstTraversal(buildExample2())));
        System.out.println("ABCHDEFG".equals(BinaryTree.breadthFirstTraversal(buildExample3())));

    }

    private static BinaryTree buildExample1() {
        /*
                     A
                   /  \
                  B    C
                 /    / \
                D    E   F
                        /
                       G
                        \
                         H

            => A B C D E F G H
         */
        BinaryTree a = new BinaryTree("A");
        BinaryTree b = new BinaryTree("B");
        BinaryTree c = new BinaryTree("C");
        BinaryTree d = new BinaryTree("D");
        BinaryTree e = new BinaryTree("E");
        BinaryTree f = new BinaryTree("F");
        BinaryTree g = new BinaryTree("G");
        BinaryTree h = new BinaryTree("H");
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        f.left = g;
        g.right = h;

        return a;
    }

    private static BinaryTree buildExample2() {
        /*
                     A
                   /  \
                  B    C
                  \
                  D

            => A B C D
         */

        BinaryTree a = new BinaryTree("A");
        BinaryTree b = new BinaryTree("B");
        BinaryTree c = new BinaryTree("C");
        BinaryTree d = new BinaryTree("D");

        a.left = b;
        a.right = c;
        b.left = d;

        return a;
    }

    private static BinaryTree buildExample3() {
        /*
                     A
                   /  \
                  B    C
                  \   / \
                  H  D  E
                    /
                   F
                  /
                 G
            => A B C H D E F G
         */
        BinaryTree a = new BinaryTree("A");
        BinaryTree b = new BinaryTree("B");
        BinaryTree c = new BinaryTree("C");
        BinaryTree d = new BinaryTree("D");
        BinaryTree e = new BinaryTree("E");
        BinaryTree f = new BinaryTree("F");
        BinaryTree g = new BinaryTree("G");
        BinaryTree h = new BinaryTree("H");
        a.left = b;
        a.right = c;
        b.right = h;
        c.left = d;
        c.right = e;
        d.left = f;
        f.left = g;

        return a;
    }

}
