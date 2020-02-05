# Algorithms and Data Structures

[![Build Status](https://travis-ci.org/MichalAdorno/kata-exercises.svg?branch=master)](https://travis-ci.org/MichalAdorno/kata-exercises)

## Learning Resources: 

* [MARTIN] R. Martin, The Clean Coder
* [SEDGEWICK] R. Sedgewick, K. Wayne, Algorithms (4th ed.)
* [CORMEN] T. Cormen, Ch. Leiserson, R. Rivest, C. Stein, Introduction to Algorithms (2rd ed.)
* [WIRTH] N. Wirth, Algorithmen und Datenstrukturen
* [LAAK] G. Laakman-McDowell, Cracking the Coding Interview: 150 Programming Questions and Solutions
## Problems / Package Description:
My solutions to algorithmic problems are grouped in distinct packages:
### arithmetics.binaryconversion
Implement a converter of an integer to its binary representation eg.:
* 5 as binary is:    101
* 6 as binary is:    110

(Use Deque interface.)
### combinatorics.newtonbinomial
Compute Newton (binomial) coefficient with limits:
* cap their value if it is going to be bigger than 1_000_000_000,
* ensure there is no arithmetic overflow,
* do not use the BigDecimal / BigInteger classes of Java.

### concurrency.diningphilosophers
Implement a solution to the Dining Philosophers problem.

_Note_: threads should avoid circular deadlocks, so there are several directed graph representing synchronisation on forks is a correct solution.

Implement a generalized solution to this problem. Any valid graph representing philosophers taking forks should define the "protocol" of fork-usage.
### graphs.cycledetection
Suppose a graph is represented in a 2-dimensional matrix.
Write an algorithm that detects whether a directed graph has a cycle.
### heaps
Implement Max-Heap along with its operations:
* insert into heap
* delete from root
* build heap / heapify
* sift up
* sift down
### lists.onedirectional
1. Implement basic operations on one-directional pointer list.
2. Implement also the following additional operations:
* get the kth element to the end of the list (see [LAAK], ex. 2.2).
* check if a given list is a palindrome.
### misc.find3
Find three numbers a, b, c (a "troika" in Russian;) ) such that:
* a < b < c
* exists i<j<k in [0..n]: nums[i]=a && nums[j]=b && nums[k]=c
for a given array of integers `nums`.
### misc.floodfill
Implement an algorithm that for a given 2D array simulates a flood by changing its fields according to the following rules:
* floodable fields are those that have the same value as the initial flooding field
* and that can be reached only by moving north/east/south/west from an already flooded field.
### misc.floydtriangle
Top 75 Programming Interview Questions, no 57: write a program to print Floyd’s Triangle.
### misc.longestplateau
Find the longest plateau (constant value segment in a table.
### misc.monotoniccrud
If a set is represented as a monotonic array, implement CRUD operations on a set:
* union of sets
* union of sets without duplicates
* intersection
* minus (exception)
### misc.ringsofnumbers
Construct a 2-dim. array like this for a given number > 0 (below an example for 3):
```
[1, 1, 1, 1, 1]
[1, 2, 2, 2, 1]
[1, 2, 3, 2, 1]
[1, 2, 2, 2, 1]
[1, 1, 1, 1, 1]
```
### misc.tolerance
Write an algorithm that calculates the length of the longest segment A[l..r] of an array (sequence) of integers A[0..n] 
(l,r in [0..n]) for which the following conditions holds:

```
for all i,j in [l..r]: 
abs( A[i] - A[j] ) <= tol
``` 
where tol (tolerance) is a positive integer. The algorithm should be O(n^2) fast.
### misc.uncouple
A couple is two adjacent identical items in a sequence. You are to remove all couples, then process the list recursively to remove any additional couples formed by the removal of the original couples. For instance, given the list {red blue green green blue red yellow}, first remove the green couple, leaving {red blue blue red yellow}, then remove the blue couple, leaving {red red yellow}, and finally remove the red couple, leaving {yellow}.
### misc.col
1. There is an array of integers A[0..n]. Create and populate an array of boolean values according to the following rule (predicate):
for each i in [0..n]: B[i] == true <=> exists j in [0..i): A[j]==i and exists j in (i..n]: A[j]==i.
(The solution must be linear O(n) in computation time and space.)
### parsing.dijkstra
Implement the Dijkstra algorithm to evaluate arithmetic infix expressions.
* "2+(1+2)*(3-3)" -> 
* "(1+((2+3)*(4*5)))" -> 101.0
### parsing.postfixevaluator
Write an evaluator of postfix arithmetic expressions.
For example, it should return the following results given postfix expressions:
* postfix("7 3 +") = 7 + 3 = 10
* postfix("7 3 + 8 1 - *") = (7 + 3) * (8 - 1) = 70. 
### parsing.tokenizer
Tokenize an expression given the list of tokens eg.: 
* "(1+sqrt(5))/2" --> ["(","1","+","sqrt","(","5",")",")","/","2"]
* "1 + (2 - 3)" --> ["1","+","(","2","-","3",")"]
### searching.binary
1. Implement the binary search that finds the first and the last occurence of a value in a table, use it to get the number of occurences.
2. Implement an algorithm that finds an index i in a ascending (monothonic) array A of unique integers where A[i]==i (see [LAAK], ex. 9.3).
### searching.bitonic
Use binary search to find the maximum value in a bitonic table.
### searching.antibitonic
Use binary search to find the minimum value in an antibitonic table.
A table A[0..n] of Integers is antibitonic when there exists an index i (0<i<n) for which:
* A[0..i] forms a strictly decreasing sequence
* A[i..n] forms a strictly increasing sequence.
(So the graph of i->A[i] is similar to the letter "V".)

### sorting.heapsort
Implement HeapSort (use previously implemented max-heap).
### strings.cyclic
Check if a given string is a cyclic transformation of another, eg.:
* abbbc <-> bbbca
* aabb  <-> bbaa.
### strings.parentheses
Write a stack client Parentheses.java that reads a string of parentheses, square brackets, and curly braces from standard input and uses a stack to determine whether they are properly balanced. For example, your program should print `true` for `"[()]{}{[()()]()}"` and `false` for `"[(])"`.
### trees.bds
Implement a breadth-first algorithm. A binary tree should be represented as a pointer-based data structure.
The algorithm should use a queue.
For example, a tree:
```   
             |a|
            /   \
         |b|    |c|
        /  \       \
     |d|   |e|     |f|
                      \
                      |g|
```
should be printed as: `a b c d e f g`. 
### trees.bst
Binary Search Trees:
1. Implement an algorithm that finds a successor of a given element of a binary search tree.
