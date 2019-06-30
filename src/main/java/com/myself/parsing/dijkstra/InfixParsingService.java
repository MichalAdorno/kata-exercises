package com.myself.parsing.dijkstra;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

import static java.util.Objects.isNull;

public class InfixParsingService {

    public Double parseInfix(final List<String> expression,
                             final Map<String, BiFunction<Double, Double, Double>> applicableInfixOperators) {
        if (isNull(expression) || expression.size() == 0) {
            throw new RuntimeException("Empty expression cannot be evaluated!");
        }
        Deque<String> ops = new LinkedList<>();
        Deque<Double> vals = new LinkedList<>();

        for (String token : expression) {
            if (isBroken(token)) {
                throw new RuntimeException("Broken expression token!");
            }
            if (token.equals("(")) {
                //ignore "("
            } else if (token.equals(")")) {
                popEvalAndPush(ops, vals, applicableInfixOperators);
            } else if (isNumber(token)) {
                vals.push(Double.parseDouble(token));
            } else if (applicableInfixOperators.containsKey(token)) {
                ops.push(token);
            }
        }
        while (!ops.isEmpty()) {
            popEvalAndPushFromStart(ops, vals, applicableInfixOperators);
        }
        return vals.pop();
    }

    private void popEvalAndPush(final Deque<String> ops,
                                final Deque<Double> vals,
                                final Map<String, BiFunction<Double, Double, Double>> applicableInfixOperators) {
        String op = ops.pop();
        Double valSecond = vals.pop();
        Double valFirst = vals.pop();
        vals.push(applicableInfixOperators.get(op).apply(valFirst, valSecond));
    }

    private void popEvalAndPushFromStart(final Deque<String> ops,
                                         final Deque<Double> vals,
                                         final Map<String, BiFunction<Double, Double, Double>> applicableInfixOperators) {
        String op = ops.removeLast();
        Double valFirst = vals.removeLast();
        Double valSecond = vals.removeLast();
        vals.addLast(applicableInfixOperators.get(op).apply(valFirst, valSecond));
    }

    private boolean isBroken(String token) {
        return isNull(token) || token.equals("\\w+");
    }

    private boolean isNumber(String token) {
        return token.matches("\\d+");
    }

}
