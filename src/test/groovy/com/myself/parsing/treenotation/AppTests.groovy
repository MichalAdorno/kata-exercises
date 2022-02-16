package com.myself.parsing.treenotation

import com.myself.BaseTest
import spock.lang.Subject

class AppTests extends BaseTest {

    @Subject
    private App service = new App()

    def 'test: (1(2__)(3__))'() {
        given:
        def expression = "(1(2__)(3__))"

        when:
        def tree = service.parseIntoBinaryTree(expression)

        then:
        tree.value == "1"
        tree.left.value == "2"
        tree.left.left == null
        tree.left.right == null
        tree.right.value == "3"
        tree.right.left == null
        tree.right.right == null
    }

    def 'test: (1__)'() {
        given:
        def expression = "(1__)"

        when:
        def tree = service.parseIntoBinaryTree(expression)

        then:
        tree.value == "1"
        tree.left == null
        tree.left == null
    }

    def 'test: (0(1111(2222__)(3333__))(66(4444__)(555555__)))'() {
        given:
        def expression = "(0(1111(2222__)(3333__))(66(4444__)(555555__)))"

        when:
        def tree = service.parseIntoBinaryTree(expression)

        then:
        tree.value == "0"
        tree.left.value == "1111"
        tree.left.left.value == "2222"
        tree.left.left.left == null
        tree.left.left.right == null
        tree.left.right.value == "3333"
        tree.left.right.left == null
        tree.left.right.right == null
        tree.right.value == "66"
        tree.right.left.value == "4444"
        tree.right.right.value == "555555"
        tree.right.left.left == null
        tree.right.right.left == null
        tree.right.right.right == null
        tree.right.left.right == null
    }

    def 'test: (0(1111(2222__)_)(66(4444_(777__))(555555__)))'() {
        given:
        def expression = "(0(1111(2222__)_)(66(4444_(777__))(555555__)))"

        when:
        def tree = service.parseIntoBinaryTree(expression)

        then:
        tree.value == "0"
        tree.left.value == "1111"
        tree.left.left.value == "2222"
        tree.left.right == null
        tree.right.value == "66"
        tree.right.left.value == "4444"
        tree.right.left.left == null
        tree.right.left.right.value == "777"
        tree.right.left.right.left == null
        tree.right.left.right.right == null
        tree.right.right.value == "555555"
        tree.right.right.left == null
        tree.right.right.right == null
    }

    def 'test: (0(1111_(3333__))(66_(555555__)))'() {
        given:
        def expression = "(0(1111_(3333__))(66_(555555__)))"

        when:
        def tree = service.parseIntoBinaryTree(expression)

        then:
        tree.value == "0"
        tree.left.value == "1111"
        tree.left.left == null
        tree.left.right.value == "3333"
        tree.right.value == "66"
        tree.right.left == null
        tree.right.right.value == "555555"
        tree.right.right.left == null
        tree.right.right.right == null
    }

    def 'test: (1_(99_(0(1111(3333__)_)(66(555555__)_))))'() {
        given:
        def expression = "(1_(99_(0(1111(3333__)_)(66(555555__)_))))"

        when:
        def tree = service.parseIntoBinaryTree(expression)

        then:
        tree.value == "1"
        tree.right.value == "99"
        tree.right.left == null
        tree.right.right.value == "0"
        tree.right.right.left.value == "1111"
        tree.right.right.left.left.value == "3333"
        tree.right.right.left.left.left == null
        tree.right.right.left.left.right == null
        tree.right.right.left.right == null
        tree.right.right.right.value == "66"
        tree.right.right.right.left.value == "555555"
        tree.right.right.right.left.left == null
        tree.right.right.right.left.right == null
        tree.right.right.right.right == null
    }


}
