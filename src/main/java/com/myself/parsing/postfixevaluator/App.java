package com.myself.parsing.postfixevaluator;


import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class App {

    public static void main(String[] args){
        String[][] expressions = {
                new String[]{"7","3","+"},                      //7+3 = 10
                new String[]{"7","3","+", "8", "*"},            //(7+3)*8 = 80
                new String[]{"7","3","+", "1", "8", "-", "*"},  //(7+3)*(1-8) = -70 = 73+18-*
                new String[]{"7","3","+", "8", "1", "-", "*"}   //(7+3)*(8-1) = 70 = 73+81-*
        };
        for (String[] expression : expressions){
            System.out.printf("Value(\"%25s\") = %d\n", Arrays.toString(expression), evaluatePostfix(expression));
        }
    }

    private static int evaluatePostfix(String[] expression) {
        Deque<Integer> stack = new LinkedList<>();
        int i = 0;
        while(i < expression.length){
            if(isNumber(expression[i])) {
                stack.push(Integer.valueOf(expression[i]));
            } else if(isOperator(expression[i])){
                Integer rightValue = stack.pop();
                Integer leftValue = stack.pop();
                Integer resultValue = applyOperator(leftValue, expression[i], rightValue);
                stack.push(resultValue);
            }
            i++;
        }
        return stack.pop();
    }

    private static Integer applyOperator(Integer leftValue, String operator, Integer rightValue) {
        switch(operator){
            case "+":
                return (leftValue + rightValue);
            case "-":
                return (leftValue - rightValue);
            case "*":
                return (leftValue * rightValue);
            case "/":
                if(rightValue == 0)
                    throw new IllegalArgumentException();
                return (leftValue / rightValue);
        }
        return 0;
    }

    private static boolean isOperator(String e) {
        return "+-*/".contains(e);
    }

    private static boolean isNumber(String e) {
        return e.matches("\\d+");
    }


}
