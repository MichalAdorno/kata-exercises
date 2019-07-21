package com.myself.searching.binary.antibitonic

import com.myself.BaseTest
import com.myself.searching.antibitonic.AntiBitonicBinarySearch
import spock.lang.Subject

class AntiBitonicBinarySearchTests extends BaseTest {

    @Subject
    def service = new AntiBitonicBinarySearch();

    def 'test-1'() {
        given:
        def fixedPointIndex = 3
        int[] values = [40, 20, 11, 1, 2, 3, 5, 7, 9, 12, 13]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-2'() {
        given:
        def fixedPointIndex = 1
        int[] values = [40, 1, 2, 3, 5, 7, 9, 12, 13]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-3'() {
        given:
        def fixedPointIndex = 1
        int[] values = [40, 1, 2]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-4'() {
        given:
        def fixedPointIndex = 8
        int[] values = [40, 31, 22, 20, 19, 18, 17, 16, 15, 190]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-5'() {
        given:
        def fixedPointIndex = 7
        int[] values = [40, 31, 22, 20, 19, 18, 17, 15, 190]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }

    def 'test-6'() {
        given:
        def fixedPointIndex = -1
        int[] values = [40, 31, 22, 20, 19, 18, 17, 15]

        when:
        def resultingIndex = service.search(values)

        then:
        resultingIndex == fixedPointIndex
    }
}
