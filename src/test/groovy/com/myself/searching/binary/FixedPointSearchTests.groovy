package com.myself.searching.binary

import com.myself.BaseTest
import spock.lang.Subject

class FixedPointSearchTests extends BaseTest {

    @Subject
    def service = new FixedPointSearch();


    def 'test-1'() {
        given:
        def fixedPointIndex = 7
        int[] values = [-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-2'() {
        given:
        def fixedPointIndex = 7
        int[] values = [-40, -20, -1, 1, 2, 3, 5, 7, 8, 12, 13]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-3'() {
        given:
        def fixedPointIndex = 8
        int[] values = [-40, -20, -1, 1, 2, 3, 5, 6, 8, 12, 13]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-4'() {
        given:
        def fixedPointIndex = 10
        int[] values = [-40, -20, -10, -6, -5, -3, -2, 0, 1, 2, 10]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-5'() {
        given:
        def fixedPointIndex = 0
        int[] values = [0, 2, 10, 60, 65, 73, 82, 90, 91, 92, 910]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-6'() {
        given:
        def fixedPointIndex = 0
        int[] values = [0]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-7'() {
        given:
        def fixedPointIndex = -1
        int[] values = [10]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-8'() {
        given:
        def fixedPointIndex = 0
        int[] values = [0,10]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-9'() {
        given:
        def fixedPointIndex = 1
        int[] values = [-9,1]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

}
