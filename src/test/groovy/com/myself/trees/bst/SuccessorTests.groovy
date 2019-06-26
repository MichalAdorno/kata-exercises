package com.myself.trees.bst

import com.myself.BaseTest

class SuccessorTests extends BaseTest {

    def 'Should return null as successor when there is no successor in the tree'() {
        given:
        def root = new BST();
        root.value = 3
        root.parent = new BST()
        root.parent.value = 2
        root.parent.right = root

        /*
                 2
                 \
                 3

         */

        when:
        def successor = root.next()?.value

        then:
        successor == null

    }

    def 'Should return minimum from right-son subtree when the right-son exists (1)'() {
        given:
        def expectedSuccessor = 7
        def root = new BST();
        root.value = 3
        root.parent = new BST()
        root.parent.value = 10
        root.parent.left = root

        root.right = new BST()
        root.right.value = expectedSuccessor
        root.right.parent = root

        /*
                    10
                   /
                  3
                  \
                  7
         */

        when:
        def successor = root.next()?.value

        then:
        successor == expectedSuccessor


    }

    def 'Should return minimum from right-son subtree when the right-son exists (2)'() {
        given:
        def expectedSuccessor = 6
        def root = new BST();
        root.value = 3
        root.parent = new BST()
        root.parent.value = 10
        root.parent.left = root

        root.right = new BST()
        root.right.value = expectedSuccessor
        root.right.parent = root

        root.right.left = new BST()
        root.right.left.value = expectedSuccessor
        root.right.left.parent = root.right
        /*
                    10
                   /
                  3
                    \
                    7
                   /
                   6
         */

        when:
        def successor = root.next()?.value

        then:
        successor == expectedSuccessor


    }

    def 'Should return first grand*father on the left as successor when right-son does not exist'() {
        given:
        def expectedSuccessor = 6
        and:
        def root6 = new BST()
        def root4 = new BST()
        def root3 = new BST()
        def root2 = new BST()
        def root1 = new BST()
        and:
        root6.value = expectedSuccessor
        root4.value = 4
        root3.value = 3
        root2.value = 2
        root1.value = 1
        and:
        root4.parent = root3
        root2.parent = root3
        root3.parent = root1
        root1.parent = root6
        and:
        root3.right = root4
        root1.right = root3
        and:
        root3.left = root2
        root6.left = root1

        /*

                         6
                       /
                    1
                     \
                     3
                   /   \
                  2    4
         */

        when:
        def successor = root4.next()?.value

        then:
        successor == expectedSuccessor
    }

}
