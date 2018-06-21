# Algorithms and Data Structures


## Learning Resources: 

* [MARTIN] R. Martin, The Clean Coder
* [SEDGEWICK] R. Sedgewick, K. Wayne, Algorithms (4th ed.)
* [CORMEN] T. Cormen, Ch. Leiserson, R. Rivest, C. Stein, Introduction to Algorithms (2rd ed.)
* [WIRTH] N. Wirth, Algorithmen und Datenstrukturen
* [LAAK] G. Laakman-McDowell, Cracking the Coding Interview: 150 Programming Questions and Solutions
## Package Description:

### arithmetics.binaryconversion
Implement a converter of an integer to its binary representation eg.:
* 5 as binary is:    101
* 6 as binary is:    110

(Use Deque interface.)
### concurrency.diningphilosophers
Implement a solution to the Dining Philosophers problem.

_Note_: threads should avoid circular deadlocks, so _any_ acyclical directed graph representing synchronisation on forks is a correct solution.
### heaps
Implement Max-Heap along with its operations:
* insert into heap
* delete from root
* build heap / heapify
* sift up
* sift down
### lists.onedirectional
Implement basic operations on one-directional pointer list.
Implement also the following additional operations:
* get the kth element to the end of the list (see [LAAK], ex. 2.2).
* check if a given list is a palindrome.
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
### misc.uncouple
A couple is two adjacent identical items in a sequence. You are to remove all couples, then process the list recursively to remove any additional couples formed by the removal of the original couples. For instance, given the list {red blue green green blue red yellow}, first remove the green couple, leaving {red blue blue red yellow}, then remove the blue couple, leaving {red red yellow}, and finally remove the red couple, leaving {yellow}.
### parsing.dijkstra
Implement the Dijkstra algorithm to evaluate arithmetic expressions.
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
Implement the binary search that finds the first and the last occurence of a value in a table, use it to get the number of occurences.
### searching.bitonic
Use binary search to find the maximum value in a bitonic table.
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