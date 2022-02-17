package com.myself.trees.longestuniquepath

import com.myself.BaseTest
import com.myself.trees.bds.BinaryTree
import spock.lang.Subject

class LongestUniquePathTests extends BaseTest {

    @Subject
    private App service = new App()

    def 'test 1'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("3")
        tree.left.left = new BinaryTree("2")
        tree.left.right = new BinaryTree("4")
        tree.left.left.right = new BinaryTree("5")
        /*
                     1
                   /   \
                  2     3
                 / \
                2   4
                 \
                  5
         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 3
    }

    def 'test 2'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("3")
        tree.left.left = new BinaryTree("2")
        tree.left.right = new BinaryTree("4")
        tree.left.right.left = new BinaryTree("8")
        tree.left.right.right = new BinaryTree("9")
        tree.left.left.right = new BinaryTree("5")
        /*
                     1
                   /   \
                  2     3
                 /  \
               2      4
                \    /  \
                 5  8    9
         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 4
    }

    def 'test 3'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("3")
        tree.left.left = new BinaryTree("2")
        tree.left.right = new BinaryTree("4")
        tree.left.right.left = new BinaryTree("8")
        tree.left.right.right = new BinaryTree("8")
        tree.left.left.right = new BinaryTree("5")
        /*
                     1
                   /   \
                  2     3
                 /  \
               2      4
                \    /  \
                 5  8    8
         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 4
    }

    def 'test 4'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("2")
        tree.left.left = new BinaryTree("4")
        tree.left.right = new BinaryTree("4")
        tree.left.right.left = new BinaryTree("8")
        tree.left.right.right = new BinaryTree("8")
        tree.left.left.right = new BinaryTree("5")
        /*
                     1
                   /   \
                  2     2
                 /  \
               4      4
                \    /  \
                 5  8    8
         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 4
    }

    def 'test 5'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("2")

        /*
                     1
                   /   \
                  2     2

         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 2
    }

    def 'test 6'() {
        given:
        def tree = new BinaryTree("1")

        /*
                     1

         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 1
    }

    def 'test 6a'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")

        /*
                     1
                   /
                  2

         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 2
    }

    def 'test 6b'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.left.left = new BinaryTree("2")

        /*
                     1
                   /
                  2
                 /
                2


         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 2
    }

    def 'test 7'() {
        given:
        def tree = null

        /*
                     NULL

         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 0
    }

    def 'test 8'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("2")
        tree.left.left = new BinaryTree("4")
        tree.left.right = new BinaryTree("4")
        tree.left.right.left = new BinaryTree("8")
        tree.left.right.right = new BinaryTree("8")
        tree.left.right.right.left = new BinaryTree("3")
        tree.left.right.right.right = new BinaryTree("1")
        tree.left.left.right = new BinaryTree("5")
        tree.left.left.right.left = new BinaryTree("4")
        tree.left.left.right.left.left = new BinaryTree("11")

        /*
                     1
                   /   \
                  2     2
                 /  \
               4      4
                \    /  \
                 5  8    8
               /       /   \
              4       3     1
             /
            11

         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 5
    }

    def 'test 8a'() {
        given:
        def tree = new BinaryTree("1")
        tree.left = new BinaryTree("2")
        tree.right = new BinaryTree("2")
        tree.left.left = new BinaryTree("4")
        tree.left.left.right = new BinaryTree("5")
        tree.left.left.right.left = new BinaryTree("4")
        tree.left.left.right.left.left = new BinaryTree("11")

        /*
                     1
                   /   \
                  2     2
                 /
               4
                \
                 5
               /
              4
             /
            11

         */

        when:
        def longestUniquePathLength = service.maxUniquePathLength1(tree)

        then:
        longestUniquePathLength == 4
    }

}
