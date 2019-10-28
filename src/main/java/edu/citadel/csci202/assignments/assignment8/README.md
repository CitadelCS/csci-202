# Assignment 8

## Problem Description

### Problem 1

Write a recursive method that parses a binary number as a string into a decimal
integer. The method header is

`public static int bin2Dec(String binaryString)`

Write a test program that prompts the user to enter a binary string and displays its decimal
equivalent.

### Problem 2

Write a recursive method to print all the permutations of a string.

For example, for the string abc, the permutation is:

```text
abc
acb
bac
bca
cab
cba
```

**(Hint: Define the following two methods. The second is a helper method.)**

`public static void displayPermutation(String s)`

`public static void displayPermutation(String s1, String s2)`

The first method simply invokes `displayPermutation(" ", s)`. The second method uses a loop
to move a character from `s2` to `s1` and recursively invokes it with a new `s1` and `s2`. The
base case is that `s2` is empty and prints `s1` to the console.

Write a test program that prompts the user to enter a string and displays all its permutations.

## Submission Instructions:

1. Finish the assignment from the instructions above
2. Commit your code to your repository

## Total Points: 100

## Grading Rubic

|               |  5  |  4  |  3  |  2  |  1  | Points |
|---------------|:---:|:---:|:---:|:---:|:---:|:------:|
| Coding Style  |     |     |     |     |     |        |
| Accuracy      |     |     |     |     |     |        |
| Comments      |     |     |     |     |     |        |
| Efficiency    |     |     |     |     |     |        |

## Overall Grade

| Letter Grade   | Points |
|:--------------:|:------:|
|     -          |   -    |