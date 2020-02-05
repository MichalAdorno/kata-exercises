package com.myself.misc.countcountries

import com.myself.BaseTest
import spock.lang.Subject

class RecursiveCountryCounterTests extends BaseTest {

    @Subject
    RecursiveCountryCounter service = new RecursiveCountryCounter();

    def 'RecursiveCountryCounter should handle a large 2D array of 1s'() {
        given:
        int N = 80;
        int[][] A = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = 1;
            }
        }

        when:
        def result = service.countCountries(A);

        then:
        result == 1
    }

}
