package com.myself.misc.tolerance

import com.myself.BaseTest
import spock.lang.Subject

class MaxToleranceCalculatorServiceTest extends BaseTest {

    @Subject
    MaxToleranceCalculatorService service = new MaxToleranceCalculatorService();

    def 'test-1'() {
        given:
        def values = [5, 1, 3, 5, 8, 6, 6, 9, 10]
        def expectedMaxLength = 4
        when:
        def maxLength = service.maxSegmentLengthWithinTolerance(values, 3)
        then:
        maxLength == expectedMaxLength
    }
    
}
