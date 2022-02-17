package com.myself.trees.longestuniquepath;

import com.myself.trees.bds.BinaryTree;

import java.util.HashSet;
import java.util.Set;

public class App {

    public int maxUniquePathLength1(final BinaryTree tree) {
        if (tree == null){
            return 0;
        }
        final var path = new HashSet<String>();
        path.add(tree.value);
        return computeMaxUniquePathLength1(tree, path, 1);
    }

    private int computeMaxUniquePathLength1(final BinaryTree tree, final Set<String> path, final int length){
        var leftPathLength = length;
        var rightPathLength = length;

        if(tree.left != null && !path.contains(tree.left.value)){
            final var leftPath = new HashSet<>(path);
            leftPath.add(tree.left.value);
            leftPathLength = computeMaxUniquePathLength1(tree.left, leftPath, length+1);
        }
        if(tree.right != null && !path.contains(tree.right.value)){
            final var rightPath = new HashSet<>(path);
            rightPath.add(tree.right.value);
            rightPathLength = computeMaxUniquePathLength1(tree.right, rightPath, length+1);
        }
        return Math.max(leftPathLength, rightPathLength);
    }

}
