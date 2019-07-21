package com.myself.misc.col

import com.myself.BaseTest
import spock.lang.Subject

class Col1Tests extends BaseTest {

    @Subject
    Col1 service = new Col1();

    def 'test-1'() {
        given:
        List<Integer> A = [1, 3, 2, 4, 3, 5, 1]
        when:
        def output = service.predicate(A)
        then:
        output == [false, true, false, true, false, false, false]
    }

    def 'test-2'() {
        given:
        List<Integer> A = [1, 2, 3]
        when:
        def output = service.predicate(A)
        then:
        output == [false, false, false]
    }

    def 'test-3'() {
        given:
        List<Integer> A = [1, 2, 3, 4, 1, 2, 3, 4]
        when:
        def output = service.predicate(A)
        then:
        output == [false, true, true, true, true, false, false, false]
    }

    def 'test-4'() {
        given:
        List<Integer> A = [1, 2, 3, 4, 5, 2, 3, 4]
        when:
        def output = service.predicate(A)
        then:
        output == [false, false, true, true, true, false, false, false]
    }

    def 'test-5'() {
        given:
        List<Integer> A = [4, 3, 2, 5, 4, 3, 2, 1]
        when:
        def output = service.predicate(A)
        then:
        output == [false, false, false, true, false, false, false, false]
    }

    def 'test-6'() {
        given:
        List<Integer> A = [5, 2, 3, 4, 4, 3, 2, 1]
        when:
        def output = service.predicate(A)
        then:
        output == [false, false, true, true, false, false, false, false]
    }

}
