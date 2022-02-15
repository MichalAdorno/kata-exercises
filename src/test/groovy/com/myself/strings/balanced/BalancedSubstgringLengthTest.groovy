package com.myself.strings.balanced

import com.myself.BaseTest
import spock.lang.Subject

class BalancedSubstgringLengthTest extends BaseTest {

    @Subject
    BalancedSubstgringLength service = new BalancedSubstgringLength()

    def 'test maxBalancedSubstringLength1'() {

        when:
        def result = service.maxBalancedSubstringLength1(arr)

        then:
        result == expectedResult

        where:
        arr                                     || expectedResult
        ""                                      || -1
        "x"                                     || -1
        "xx"                                    || -1
        "xxX"                                   || 3
        "xxXsssssssCCCCc"                       || 5
        "Madam"                                 || -1
        "CatTAc"                                || 6
        "CatTAcxx"                              || 6
        "CatTAcxxX"                             || 9
        "zzzZZZcnnnnNNNN"                       || 8
        "kkLLLLllxxx"                           || 6
        "xXxXxXxXooooooooooooo"                 || 8
        "TY"                                    || -1
        "qwertyQWERTYmmmmmmmmmmmmBbBb"          || 12
        "ZZzoooooooVVVVvoooooXX"                || 5
        "ZZXXxzfFoooooooVVVVvoooooXX"           || 8

    }

}