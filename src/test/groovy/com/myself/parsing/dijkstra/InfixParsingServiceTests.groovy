package com.myself.parsing.dijkstra

import com.myself.BaseTest
import spock.lang.Subject

import java.util.function.BiFunction

class InfixParsingServiceTests extends BaseTest {

    @Subject
    private InfixParsingService service = new InfixParsingService()

    private Map<String, BiFunction<Double, Double, Double>> operators = new HashMap<>()


    def 'parsing "(2+(1+2)*(3-3))" should return 2'() {
        given:
        def expression = ["(", "2", "+", "(", "1", "+", "2", ")", "*", "(", "3", "-", "3", ")", ")"]

        when:
        def result = service.parseInfix(expression, operators)

        then:
        result == 2.0

    }

    def 'parsing "2+3-1" should return 4'() {
        given:
        def expression = ["2", "+", "3", "-", "1"]

        when:
        def result = service.parseInfix(expression, operators)

        then:
        result == 4.0

    }

    def 'parsing "2+3-1-1" should return 3'() {
        given:
        def expression = ["2", "+", "3", "-", "1", "-", "1"]

        when:
        def result = service.parseInfix(expression, operators)

        then:
        result == 3.0

    }

    def 'parsing "1+(2+(1+2)*(3-3))" should return 2'() {
        given:
        def expression = ["1", "+", "(", "2", "+", "(", "1", "+", "2", ")", "*", "(", "3", "-", "3", ")", ")"]

        when:
        def result = service.parseInfix(expression, operators)

        then:
        result == 3.0

    }

    def 'parsing "(1-1)+(2+(1+2)*(3-3))" should return 2'() {
        given:
        def expression = ["(", "1", "-", "1", ")", "+", "(", "2", "+", "(", "1", "+", "2", ")", "*", "(", "3", "-", "3", ")", ")"]

        when:
        def result = service.parseInfix(expression, operators)

        then:
        result == 2.0

    }

    def 'parsing "(1+((2+3)*(4*5)))" should return 0'() {
        given:
        def expression = ["(", "1", "+", "(", "(", "2", "+", "3", ")", "*", "(", "4", "*", "5", ")", ")", ")"]

        when:
        def result = service.parseInfix(expression, operators)

        then:
        result == 101.0

    }

    def setup() {

        def op = new BiFunction<Double, Double, Double>() {
            @Override
            Double apply(Double aDouble, Double aDouble2) {
                return aDouble + aDouble2
            }
        }
        operators.put("+", op)
        op = new BiFunction<Double, Double, Double>() {
            @Override
            Double apply(Double aDouble, Double aDouble2) {
                return aDouble - aDouble2
            }
        }
        operators.put("-", op)
        op = new BiFunction<Double, Double, Double>() {
            @Override
            Double apply(Double aDouble, Double aDouble2) {
                return aDouble * aDouble2
            }
        }
        operators.put("*", op)

    }

}
