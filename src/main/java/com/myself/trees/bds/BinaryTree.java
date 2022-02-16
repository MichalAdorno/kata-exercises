package com.myself.trees.bds;


import java.util.Deque;
import java.util.LinkedList;

public class BinaryTree {

    public BinaryTree left;
    public String value;
    public BinaryTree right;

    public BinaryTree(String value) {
        this.value = value;
    }

    public BinaryTree(BinaryTree left, String value, BinaryTree right) {
        this.left = left;
        this.value = value;
        this.right = right;
    }

    public static String breadthFirstTraversal(BinaryTree root){
        StringBuilder accumulator = new StringBuilder("");
        Deque<BinaryTree> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryTree node = queue.removeFirst();
            accumulator.append(node.value);
            if(node.left != null)
                queue.addLast(node.left);
            if(node.right != null)
                queue.addLast(node.right);
        }
        return accumulator.toString();
    }

}

