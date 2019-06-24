package com.myself.misc.floodfill

import com.myself.BaseTest
import spock.lang.Subject

class FloodTests extends BaseTest {

    @Subject
    Flood flood = new Flood();

    void 'given area-1 then substitute (2) for (9)'() {
        given:
        def watermark = 9
        def arr = [
                [1, 1, 1, 1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1, 1, 0, 0],
                [1, 0, 0, 1, 1, 0, 1, 1],
                [1, 2, 2, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 2, 2, 0],
                [1, 1, 1, 1, 1, 2, 1, 1],
                [1, 1, 1, 1, 1, 2, 2, 1]
        ] as Integer[][]
        and:
        def area = new Area(arr)
        area.print()
        def start = new Point(3, 1)
        when:
        def floodedArea = flood.fillWithWater(area, start, watermark)
        then:
        println()
        println()
        floodedArea.print()
        floodedArea != null
    }

    void 'given area-2 then substitute (2) for (9)'() {
        given:
        def watermark = 9
        def arr = [
                [1, 1, 1, 1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1, 1, 0, 0],
                [1, 0, 0, 1, 1, 0, 1, 1],
                [1, 2, 7, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 7, 2, 0],
                [1, 1, 1, 1, 1, 2, 1, 1],
                [1, 1, 1, 1, 1, 2, 2, 1]
        ] as Integer[][]
        and:
        def area = new Area(arr)
        area.print()
        def start = new Point(3, 3)
        when:
        def floodedArea = flood.fillWithWater(area, start, watermark)
        then:
        println()
        println()
        floodedArea.print()
        floodedArea != null
    }

    void 'given area-3 then substitute (1) for (9)'() {
        given:
        def watermark = 9
        def arr = [
                [1, 1, 1, 1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1, 1, 0, 0],
                [1, 0, 0, 1, 1, 0, 1, 1],
                [1, 2, 7, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 7, 2, 0],
                [1, 1, 1, 1, 1, 2, 1, 1],
                [1, 1, 1, 1, 1, 2, 2, 1]
        ] as Integer[][]
        and:
        def area = new Area(arr)
        area.print()
        def start = new Point(0, 0)
        when:
        def floodedArea = flood.fillWithWater(area, start, watermark)
        then:
        println()
        println()
        floodedArea.print()
        floodedArea != null
    }

    void 'given area-4 then substitute (0) for (9)'() {
        given:
        def watermark = 9
        def arr = [
                [1, 1, 1, 1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1, 1, 0, 0],
                [1, 0, 0, 1, 1, 0, 1, 1],
                [1, 2, 7, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 7, 2, 0],
                [1, 1, 1, 1, 1, 2, 1, 1],
                [1, 1, 1, 1, 1, 2, 2, 1]
        ] as Integer[][]
        and:
        def area = new Area(arr)
        area.print()
        def start = new Point(3, 7)
        when:
        def floodedArea = flood.fillWithWater(area, start, watermark)
        then:
        println()
        println()
        floodedArea.print()
        floodedArea != null
    }

    void 'given area-5 then substitute (7) for (9)'() {
        given:
        def watermark = 9
        def arr = [
                [1, 1, 1, 1, 1, 1, 1, 1],
                [1, 1, 1, 1, 1, 1, 0, 0],
                [1, 0, 0, 1, 1, 0, 1, 1],
                [1, 2, 7, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 0, 1, 0],
                [1, 1, 1, 2, 2, 7, 2, 0],
                [1, 1, 1, 1, 1, 2, 1, 1],
                [1, 1, 1, 1, 1, 2, 2, 1]
        ] as Integer[][]
        and:
        def area = new Area(arr)
        area.print()
        def start = new Point(3, 2)
        when:
        def floodedArea = flood.fillWithWater(area, start, watermark)
        then:
        println()
        println()
        floodedArea.print()
        floodedArea != null
    }

}
