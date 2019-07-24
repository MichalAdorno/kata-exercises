package com.myself.misc.find3

import com.myself.BaseTest
import spock.lang.Subject

class MonothonicTroikaFinderTests extends BaseTest {

    @Subject
    private MonothonicTroikaFinder service = new MonothonicTroikaFinder();

    def 'test-1'() {
        given:
        def nums = [12, 11, 8, 10, 5, 3, 7, 2, 1, 11]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-2'() {
        given:
        def nums = [12, 11, 8]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null
    }

    def 'test-3'() {
        given:
        def nums = [12, 11, 8, 9]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null

    }

    def 'test-4'() {
        given:
        def nums = [12, 11, 8, 9]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null

    }

    def 'test-5'() {
        given:
        def nums = [12, 11, 8, 9, 1]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null

    }

    def 'test-6'() {
        given:
        def nums = [12, 11, 8, 9, 1, 11]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-7'() {
        given:
        def nums = [8, 9, 1, 11]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-8'() {
        given:
        def nums = [8, 9, 11]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-9'() {
        given:
        def nums = [8, 9, 11, 1]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-10'() {
        given:
        def nums = [9, 8, 7, 6, 5, 7, 6, 7, 5, 8, 4, 9, 1, 8]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-11'() {
        given:
        def nums = [8, 4, 9, 1, 8]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null
    }

    def 'test-12'() {
        given:
        def nums = [9, 1, 8, 2, 7, 1, 6]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-13'() {
        given:
        def nums = [9, 8, 7, 8, 9]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-14'() {
        given:
        def nums = [9, 9, 9]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null
    }

    def 'test-15'() {
        given:
        def nums = [9, 9, 10]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika == null
    }

    def 'test-16'() {
        given:
        def nums = [9, 9, 10, 11]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }

    def 'test-17'() {
        given:
        def nums = [9, 9, 10, 10, 11, 11]
        when:
        def troika = service.findIncreasingTroika(nums)
        then:
        println(troika)
        troika != null
        with(troika) {
            x < y
            y < z
        }
    }
}