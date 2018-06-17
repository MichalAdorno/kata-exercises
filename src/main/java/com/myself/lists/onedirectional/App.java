package com.myself.lists.onedirectional;


public class App {

    public static void main(String[] args) {
        //---
        List<Integer> list = ListLib.createListFromArray(new Integer[]{1,2,3,4,5,6,7,8,9});
        List<Integer> palindromeCandidate;
        int kth;
        Integer kthElem;
        //reverse
        System.out.println("list      = " + list);
        list = ListLib.reverse(list);
        System.out.println("reverse   = " + list);
        list = ListLib.reverse(list);
        System.out.println("reverse   = " + list);
        //remove
        list = ListLib.remove(list,6);
        System.out.println("remove(6) = " + list);
        list = ListLib.remove(list,1);
        System.out.println("remove(1) = " + list);
        list = ListLib.remove(list,9);
        System.out.println("remove(9) = " + list);
        list = ListLib.remove(list,9);
        System.out.println("remove(9) = " + list);
        //---
        kth = 3;
        kthElem = ListLib.kthToLast(list, kth);
        System.out.printf("Element no. %d from tail is: %d\n", kth, kthElem);
        //---
        kth = 2;
        kthElem = ListLib.kthToLast(list, kth);
        System.out.printf("Element no. %d from tail is: %d\n", kth, kthElem);
        //---
        kth = 1;
        kthElem = ListLib.kthToLast(list, kth);
        System.out.printf("Element no. %d from tail is: %d\n", kth, kthElem);
        //---
        kth = 6;
        kthElem = ListLib.kthToLast(list, kth);
        System.out.printf("Element no. %d from tail is: %d\n", kth, kthElem);
        //---
        kth = 20;
        kthElem = ListLib.kthToLast(list, kth);
        System.out.printf("Element no. %d from tail is: %d\n", kth, kthElem);

        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1,2,3,3,2,1});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1,2,3,3,2});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1,2,3,2,1});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1,2,1});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1,1});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1,2});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{1});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
        //---
        palindromeCandidate = ListLib.createListFromArray(new Integer[]{});
        System.out.printf("The list [%20s] is palindrome: %b\n", palindromeCandidate, ListLib.isPalindrome(palindromeCandidate));
    }


}
