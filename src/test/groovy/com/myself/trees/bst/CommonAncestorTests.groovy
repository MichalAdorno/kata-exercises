package com.myself.trees.bst

import com.myself.BaseTest

class CommonAncestorTests extends BaseTest {

    def 'test-1'() {
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
        def commonAncestor = root.parent.commonAncestor(2, 3)

        then:
        commonAncestor != null
        commonAncestor.value == 2
    }

    def 'test-2'() {
        given:
        def root = new BST();
        root.value = 3
        root.parent = new BST()
        root.parent.value = 10
        root.parent.left = root

        root.right = new BST()
        root.right.value = 7
        root.right.parent = root

        /*
                    10
                   /
                  3
                  \
                  7
         */

        when:
        def commonAncestor1 = root.parent.commonAncestor(10, 7)
        and:
        def commonAncestor2 = root.parent.commonAncestor(3, 7)

        then:
        commonAncestor1 != null
        commonAncestor1.value == 10
        and:
        commonAncestor2 != null
        commonAncestor2.value == 3

    }

    def 'test-3'() {
        given:
        def root = new BST();
        root.value = 3
        root.parent = new BST()
        root.parent.value = 10
        root.parent.left = root

        root.right = new BST()
        root.right.value = 7
        root.right.parent = root

        root.right.left = new BST()
        root.right.left.value = 6
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
        def commonAncestor1 = root.parent.commonAncestor(3, 7)
        and:
        def commonAncestor2 = root.parent.commonAncestor(3, 6)
        and:
        def commonAncestor3 = root.parent.commonAncestor(10, 6)

        then:
        commonAncestor1 != null
        commonAncestor1.value == 3
        and:
        commonAncestor2 != null
        commonAncestor2.value == 3
        and:
        commonAncestor3 != null
        commonAncestor3.value == 10


    }

    def 'test-4'() {
        given:
        def root8 = new BST()
        def root6 = new BST()
        def root4 = new BST()
        def root3 = new BST()
        def root2 = new BST()
        def root1 = new BST()
        and:
        root8.value = 8
        root6.value = 6
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
        root6.right = root8
        root3.right = root4
        root1.right = root3
        and:
        root3.left = root2
        root6.left = root1

        /*

                         6
                       /  \
                    1     8
                     \
                     3
                   /   \
                  2    4
         */

        when:
        def commonAncestor1 = root6.commonAncestor(2, 4)
        and:
        def commonAncestor2 = root6.commonAncestor(3, 4)
        and:
        def commonAncestor3 = root6.commonAncestor(3, 8)
        and:
        def commonAncestor4 = root6.commonAncestor(2, 8)
        and:
        def commonAncestor5 = root2.commonAncestor(2, 2)
        and:
        def commonAncestor6 = root6.commonAncestor(1, 8)

        then:
        commonAncestor1 != null
        commonAncestor1.value == 3
        and:
        commonAncestor2 != null
        commonAncestor2.value == 3
        and:
        commonAncestor3 != null
        commonAncestor3.value == 6
        and:
        commonAncestor4 != null
        commonAncestor4.value == 6
        and:
        commonAncestor5 != null
        commonAncestor5.value == 2
        and:
        commonAncestor6 != null
        commonAncestor6.value == 6


    }

}
