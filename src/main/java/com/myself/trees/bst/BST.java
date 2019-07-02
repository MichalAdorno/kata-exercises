package com.myself.trees.bst;


import java.util.Deque;
import java.util.LinkedList;

public class BST {

    public BST left;
    public Integer value;
    public BST right;
    public BST parent;

    public BST(Integer value) {
        this.value = value;
    }

    public static String breadthFirstTraversal(BST root) {
        StringBuilder accumulator = new StringBuilder("");
        Deque<BST> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            BST node = queue.removeFirst();
            accumulator.append(node.value);
            if (node.left != null)
                queue.addLast(node.left);
            if (node.right != null)
                queue.addLast(node.right);
        }
        return accumulator.toString();
    }

    public BST minimum() {
        BST current = this;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public BST maximum() {
        BST current = this;
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    public BST next() {
        BST current = this;
        if (current.right != null) {
            return current.right.minimum();
        }

        BST parentOfCurrent = current.parent;
        while (parentOfCurrent != null
                && parentOfCurrent.right == current) {
            current = parentOfCurrent;
            parentOfCurrent = parentOfCurrent.parent;
        }
        return parentOfCurrent;
    }

    public BST commonAncestor(final Integer first, final Integer second) {
        //"this" must be the tree root, we assume it is always accessible to
        //start searching for the first common ancestor from the tree root
        //we also assume that the tree is a BST tree
        BST current = this;

        while (current != null) {
            if (first == current.value || second == current.value) {
                return current;
            } else if (first < current.value && second < current.value) {
                current = current.left;
            } else if (first > current.value && second > current.value) {
                current = current.right;
            } else if (first < current.value && second > current.value) {
                return current;
            } else if (first > current.value && second < current.value) {
                return current;
            }
        }
        return current;

    }

}

