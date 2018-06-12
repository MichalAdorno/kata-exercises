package com.myself.strings.parentheses;


import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {
        String[] expressions = {
                "[()]{}{[()()]()}"  //true
                , "[(])"            //false
                , "{{}]}"           //false
                , "{{}}"            //true
                , "{{[()}]"         //false
                , "{[())]}"         //false
                , "{[(){}[]{}()()(())]"     //false
                , "{[(){}[]{}()()(())]}"    //true
                , "{{{}"            //false
                , "{{}]"            //false
                , "{{}"             //false
                , "({{}})"          //true
        };

        for(String e : expressions)
            System.out.format("%20s is well-built: %b\n", e, isBalanced(e));
    }
    public static boolean isBalanced(String e){
        if(e==null)
            return false;
        if(e.isEmpty())
            return true;
        //---
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : e.toCharArray()) {
            if(isLeft(c))
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                if(!matchesLast(stack.pop(), c))
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
        //---
    }
    static boolean isLeft(Character c){
        return "([{".contains(c.toString());
    }
    static boolean matchesLast(Character left, Character right){
        if(right.equals(')') && left.equals('('))
            return true;
        if(right.equals(']') && left.equals('['))
            return true;
        if(right.equals('}') && left.equals('{'))
            return true;
        return false;
    }
}
