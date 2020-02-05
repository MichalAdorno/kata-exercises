package com.myself.combinatorics.newtonbinomial

import com.myself.BaseTest
import spock.lang.Subject
import spock.lang.Unroll

class BinomialCoefficientComputationTests extends BaseTest {

    @Subject
    BinomialCoefficientComputation service = new BinomialCoefficientComputation();

    @Unroll
    def 'binomial coeff for #n and #k is #theoreticalValue'() {
        expect:
        service.solution(n, k) == theoreticalValue
        where:
        n             | k  || theoreticalValue
        20            | 14 || 38760
        20            | 20 || 1
        20            | 6  || 38760
        20            | 10 || 184756
        1_000_000_000 | 10 || -1
        30            | 14 || 145422675
        30            | 27 || 4060
        30            | 17 || 119759850
    }

}
