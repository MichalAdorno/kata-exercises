package com.myself.parsing.treenotation;

import com.myself.trees.bds.BinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class App {

    public BinaryTree parseIntoBinaryTree(final String rawExpression){
        if(rawExpression == null || rawExpression.isBlank() || rawExpression.trim().equals("_")){
            return null;
        }
        final Deque<String> tokenQueue = new LinkedList<>();
        final Deque<BinaryTree> nodeQueue = new LinkedList<>();

        var tokens =tokenize(trim(rawExpression));

        for(final String token : tokens){
            if(token.equals("(") || token.equals("_") || isNumber(token)){
                tokenQueue.push(token);
            } else if(token.equals(")")){
                var rightToken = tokenQueue.pop();
                var leftToken = tokenQueue.pop();
                if(leftToken.equals("x") && rightToken.equals("x")) { //need to clean this up
                    var rightTree = nodeQueue.pop();
                    var leftTree = nodeQueue.pop();
                    var value = tokenQueue.pop();
                    tokenQueue.pop(); //discard "("
                    var parent = new BinaryTree(leftTree, value, rightTree);
                    nodeQueue.push(parent);
                    tokenQueue.push("x");
                } else if(leftToken.equals("x") && rightToken.equals("_")){
                    var leftTree = nodeQueue.pop();
                    var value = tokenQueue.pop();
                    tokenQueue.pop(); //discard "("
                    var parent = new BinaryTree(leftTree, value, null);
                    nodeQueue.push(parent);
                    tokenQueue.push("x");
                } else if(leftToken.equals("_") && rightToken.equals("x")){
                    var rightTree = nodeQueue.pop();
                    var value = tokenQueue.pop();
                    tokenQueue.pop(); //discard "("
                    var parent = new BinaryTree(null, value, rightTree);
                    nodeQueue.push(parent);
                    tokenQueue.push("x");
                } else if(leftToken.equals("_") && rightToken.equals("_")){
                    var value = tokenQueue.pop();
                    tokenQueue.pop(); //discard "("
                    var parent = new BinaryTree(null, value, null);
                    nodeQueue.push(parent);
                    tokenQueue.push("x");
                }
            }
        }

        return nodeQueue.pop();
    }

    private boolean isNumber(final String token){
        return token.matches("[0-9]+");
    }

    private String trim(final String expression){
        return expression.replaceAll(" ","");
    }

    private List<String> tokenize(final String expression) {
        var tokenizedExpression = new LinkedList<String>();
        var acc = "";
        for(final char ch : expression.toCharArray()) {
            if (ch == '(' || ch == ')' || ch == '_') {
                if(acc != "") {
                    tokenizedExpression.addLast(acc);
                    acc = "";
                }
                tokenizedExpression.addLast(String.valueOf(ch));
            } else {
                acc = acc + ch;
            }

        }
        return tokenizedExpression;
    }

}
