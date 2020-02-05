package com.myself.misc.countcountries

import com.myself.BaseTest
import spock.lang.Ignore
import spock.lang.Subject

class QueuingCountryCounterTests extends BaseTest {

    @Subject
    QueueingCountryCounter service = new QueueingCountryCounter()

    def 'should calculate no. of countries correctly (1)'() {
        given:
        int[][] A = [
                        [5, 4, 5],
                        [5, 4, 5],
                        [4, 5, 4]
        ] as Integer[][]

        when:
        def noOfCountries = service.countCountries(A)

        then:
        noOfCountries == 6
    }

    def 'should calculate no. of countries correctly (2)'() {
        given:
        int[][] A = [
                [1, 2, 2, 1],
                [1, 2, 3, 1],
                [1, 2, 3, 1],
                [1, 2, 2, 1],
                [1, 1, 1, 1]
        ] as Integer[][]

        when:
        def noOfCountries = service.countCountries(A)

        then:
        noOfCountries == 3
    }

    def 'should calculate no. of countries correctly (3)'() {
        given:
        int[][] A = [
                [1, 3, 3],
                [1, 4, 3],
                [1, 5, 2],
                [2, 2, 2]
        ] as Integer[][]

        when:
        def noOfCountries = service.countCountries(A)

        then:
        noOfCountries == 5
    }

    def 'should calculate no. of countries correctly (4)'() {
        given:
        int[][] A = [
                [5, 5, 5],
                [4, 5, 4],
                [4, 5, 4],
                [3, 3, 4],
                [4, 4, 3],
                [3, 3, 4]
        ] as Integer[][]

        when:
        def noOfCountries = service.countCountries(A)

        then:
        noOfCountries == 8
    }

    def 'should calculate no. of countries correctly (5)'() {
        given:
        int[][] A = [
                [1],
                [2],
                [2],
                [1],
                [2],
                [1]
        ] as Integer[][]

        when:
        def noOfCountries = service.countCountries(A)

        then:
        noOfCountries == 5
    }

    @Ignore //takes relatively long time
    def 'should handle large amount of data'() {
        given:
        int N = 10_000 //20_000 //31_000;
        int[][] A = new int[N][N];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j] = 1;
            }
        }

        when:
        def noOfCountries = service.countCountries(A)

        then:
        noOfCountries == 1
    }

}
